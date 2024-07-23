package com.example.backend.controller;

import com.example.backend.dtos.HospitalDTO;
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
import java.util.UUID;

@RestController
@RequestMapping("v1/hospital")
public class HospitalController {

    @GetMapping("")
    public ResponseEntity<String> getAllHospital(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok("lấy danh sách bệnh viện");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getHospitalById(@PathVariable("id") String hospitalId) {
        return ResponseEntity.ok("Hospital with id " + hospitalId);
    }

    @PostMapping(value = "", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> insertHospital(
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

            return ResponseEntity.ok("Thêm bệnh viện " + hospitalDTO + ", stored as " + storedFilename);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error");
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

    @PutMapping("/{id}")
    public ResponseEntity<String> updateHospital(@PathVariable int id) {
        return ResponseEntity.ok("sửa thông tin benh viện");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHospital(@PathVariable int id) {
        return ResponseEntity.ok(String.format("xóa thông tin benh viện %d", id));
    }
}
