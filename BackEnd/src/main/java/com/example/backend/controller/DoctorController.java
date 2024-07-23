package com.example.backend.controller;

import com.example.backend.dtos.DoctorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/doctors")
public class DoctorController {
    @PostMapping("/add")
    public ResponseEntity<?> addDoctor(@RequestBody DoctorDTO doctorDTO) {
        try {
            // Logic to add doctor
            return ResponseEntity.ok("Doctor added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
