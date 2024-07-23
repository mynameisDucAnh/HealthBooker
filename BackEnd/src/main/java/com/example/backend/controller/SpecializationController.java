package com.example.backend.controller;

import com.example.backend.dtos.SpecializationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/specializations")
public class SpecializationController {
    @PostMapping("/add")
    public ResponseEntity<?> addSpecialization(@RequestBody SpecializationDTO specializationDTO) {
        try {
            // Logic to add specialization
            return ResponseEntity.ok("Specialization added successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
