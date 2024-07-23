package com.example.backend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {
    @JsonProperty("user_id")
    private Integer userId;
    private String specialization;
    private String qualification;
    @JsonProperty("experience_years")
    private Integer experienceYears;
    @JsonProperty("clinic_address")
    private String clinicAddress;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
}
