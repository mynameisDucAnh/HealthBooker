package com.example.backend.controller;

import com.example.backend.dtos.AppointmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.prefix}/appointments")
public class AppointmentController {
    @PostMapping("/schedule")
    public ResponseEntity<?> scheduleAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        try {
            // Logic to schedule appointment
            return ResponseEntity.ok("Appointment scheduled successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
