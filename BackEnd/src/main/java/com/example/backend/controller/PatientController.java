package com.example.backend.controller;

import com.example.backend.dtos.PatientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.prefix}/patients")
public class PatientController {
    @PostMapping("/add")
    public ResponseEntity<?> addPatient(@RequestBody PatientDTO patientDTO) {
        try {
            // Logic to add patient
            return ResponseEntity.ok("Patient added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
