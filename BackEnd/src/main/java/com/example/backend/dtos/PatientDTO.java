package com.example.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    private String address;
    private String gender;
    @JsonProperty("medical_history")
    private String medicalHistory;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
}
