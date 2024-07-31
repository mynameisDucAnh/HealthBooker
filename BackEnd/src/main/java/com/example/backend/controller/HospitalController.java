package com.example.backend.controller;

import com.example.backend.dtos.HospitalDTO;
import com.example.backend.models.Hospital;
import com.example.backend.services.HospitalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
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
@RequestMapping("${api.prefix}/hospital")
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;
    @PostMapping(value = "", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> createHospital(
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            @RequestParam("vote") int vote,
            @RequestParam("file") MultipartFile file
    ) {
        try {
            String contentType = file.getContentType();
            if (contentType == null || !contentType.startsWith("image/")) {
                return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
                        .body("File must be an image");
            }

            // Store the file
            String storedFilename = storeFile(file);

            // Construct HospitalDTO manually
            HospitalDTO hospitalDTO = new HospitalDTO(name, description, vote, file);
            hospitalService.createHospital(hospitalDTO);
            return ResponseEntity.ok("Create hospital successfully " );
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error");
        }
    }
    @GetMapping("")
    public ResponseEntity<List<Hospital>> getAllHospital(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        List<Hospital> hospitalList = hospitalService.getAllHospital();
        return ResponseEntity.ok(hospitalList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getHospitalById(@PathVariable("id") String hospitalId) {
        return ResponseEntity.ok("Hospital with id " + hospitalId);
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

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> updateHospital(
            @PathVariable int id,
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            @RequestParam("vote") int vote,
            @RequestParam(value = "file", required = false) MultipartFile file) {
        try {
            // Find the existing hospital
            Hospital existingHospital = hospitalService.getHospitalById(id);

            // Update the name, description, and vote
            existingHospital.setName(name);
            existingHospital.setDescription(description);
            existingHospital.setVote(vote);

            // Check if a new file is provided
            if (file != null && !file.isEmpty()) {
                String contentType = file.getContentType();
                if (contentType != null && contentType.startsWith("image/")) {
                    // Store the new file
                    String storedFilename = storeFile(file);
                    existingHospital.setFile(storedFilename);
                } else {
                    return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
                            .body("File must be an image");
                }
            }

            // Save the updated hospital
            hospitalService.updateHospital(existingHospital);
            return ResponseEntity.ok("Update hospital successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error updating hospital");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHospital(@PathVariable int id) {
        hospitalService.deleteHospital(id);
        return ResponseEntity.ok(String.format("Delete hospital with "+ id+"successfully"));
    }
}
