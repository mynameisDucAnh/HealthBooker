package com.example.backend.controller;

import com.example.backend.dtos.DoctorDTO;
import com.example.backend.models.Doctor;
import com.example.backend.services.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("${api.prefix}/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @PostMapping(value = "/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> createDoctor(
            @RequestParam("userId") Integer userId,
            @RequestParam("name") String name,
            @RequestParam("specialization") String specialization,
            @RequestParam("qualification") String qualification,
            @RequestParam("experienceYears") int experienceYears,
            @RequestParam("clinicAddress") String clinicAddress,
            @RequestParam("file") MultipartFile file
    ) {
        try {
            String contentType = file.getContentType();
            if (contentType == null || !contentType.startsWith("image/")) {
                return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
                        .body("File must be an image");
            }

            String storedFilename = storeFile(file);
            DoctorDTO doctorDTO = new DoctorDTO(userId, name, specialization, qualification, experienceYears, clinicAddress, null, null, storedFilename);
            doctorService.createDoctor(doctorDTO);
            return ResponseEntity.ok("Doctor added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error adding doctor");
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Doctor>> getAllDoctors(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        List<Doctor> doctorList = doctorService.getAllDoctor();
        return ResponseEntity.ok(doctorList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable("id") int doctorId) {
        Doctor doctor = doctorService.getDoctorById(doctorId);
        if (doctor != null) {
            return ResponseEntity.ok(doctor);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> updateDoctor(
            @PathVariable int id,
            @RequestParam("name") String name,
            @RequestParam("specialization") String specialization,
            @RequestParam("qualification") String qualification,
            @RequestParam("experienceYears") int experienceYears,
            @RequestParam("clinicAddress") String clinicAddress,
            @RequestParam(value = "file", required = false) MultipartFile file
    ) {
        try {
            // Find the existing doctor
            Doctor existingDoctor = doctorService.getDoctorById(id);
            if (existingDoctor == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Doctor not found");
            }

            // Update the fields
            existingDoctor.setName(name);
            existingDoctor.setSpecialization(specialization);
            existingDoctor.setQualification(qualification);
            existingDoctor.setExperienceYears(experienceYears);
            existingDoctor.setClinicAddress(clinicAddress);

            // Check if a new file is provided
            if (file != null && !file.isEmpty()) {
                String contentType = file.getContentType();
                if (contentType != null && contentType.startsWith("image/")) {
                    // Store the new file
                    String storedFilename = storeFile(file);
                    existingDoctor.setFile(storedFilename);
                } else {
                    return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
                            .body("File must be an image");
                }
            }

            // Save the updated doctor
            doctorService.updateDoctor(existingDoctor);
            return ResponseEntity.ok("Doctor updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error updating doctor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDoctor(@PathVariable int id) {
        try {
            doctorService.deleteDoctor(id);
            return ResponseEntity.ok("Doctor with id " + id + " deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Doctor not found");
        }
    }

    private String storeFile(MultipartFile file) throws IOException {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        // Add UUID to filename to avoid collisions
        String uniqueFilename = UUID.randomUUID().toString() + "_" + filename;
        Path uploadDir = Paths.get("uploads");
        if (!Files.exists(uploadDir)) {
            Files.createDirectories(uploadDir);
        }
        // Full path to the file
        Path destination = uploadDir.resolve(uniqueFilename);
        // Copy file to the destination directory
        Files.copy(file.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);
        return uniqueFilename;
    }
}
