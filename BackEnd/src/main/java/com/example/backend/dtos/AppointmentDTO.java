package com.example.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    private Integer id;
    @JsonProperty("patient_id")
    private Integer patientId;
    @JsonProperty("doctor_id")
    private Integer doctorId;
    @JsonProperty("appointment_date")
    private LocalDate appointmentDate;
    @JsonProperty("appointment_time")
    private LocalTime appointmentTime;
    private String status;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
}
