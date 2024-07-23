package com.example.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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
    private String appointmentDate;
    @JsonProperty("appointment_time")
    private String appointmentTime;
    private String status;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
}
