package com.example.backend.controller;

import com.example.backend.dtos.AppointmentDTO;
import com.example.backend.responses.AppointmentResponses;
import com.example.backend.services.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;

    @PostMapping("/create")
    public ResponseEntity<AppointmentResponses> createAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        try {
            AppointmentResponses appointmentResponses = appointmentService.createAppointment(appointmentDTO);
            return ResponseEntity.ok(appointmentResponses);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentResponses> getAppointment(@PathVariable Integer id) {
        try {
            AppointmentResponses appointmentResponses = appointmentService.getAppointment(id);
            return ResponseEntity.ok(appointmentResponses);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AppointmentResponses> updateAppointment(@PathVariable Integer id, @RequestBody AppointmentDTO appointmentDTO) {
        try {
            AppointmentResponses appointmentResponses = appointmentService.updateAppointment(id, appointmentDTO);
            return ResponseEntity.ok(appointmentResponses);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAppointment(@PathVariable Integer id) {
        try {
            appointmentService.deleteApp(id);
            return ResponseEntity.ok("Appointment deleted successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error deleting appointment");
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<AppointmentResponses>> getAllAppointments(@PathVariable Integer userId) {
        try {
            List<AppointmentResponses> appointments = appointmentService.getAllApp(userId);
            return ResponseEntity.ok(appointments);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }
}
