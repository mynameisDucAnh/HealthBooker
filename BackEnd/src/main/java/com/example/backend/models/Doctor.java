package com.example.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "doctors")
@Data
@NoArgsConstructor
public class Doctor {

    @Id
    @Column(name = "user_id")
    private Integer userId;  // Bạn có thể thay đổi kiểu dữ liệu tùy vào cách định nghĩa của bạn

    @Column(name = "specialization", length = 100)
    private String specialization;

    @Column(name = "qualification", length = 100)
    private String qualification;

    @Column(name = "experience_years")
    private Integer experienceYears;

    @Column(name = "clinic_address", length = 200)
    private String clinicAddress;

    @Column(name = "created_at", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;
    @ManyToOne  // This sets up the many-to-one relationship with Hospital
    @JoinColumn(name = "hospital_id")  // Assuming a hospital_id column exists
    private Hospital hospital;  // This field should match the mappedBy value

    @OneToMany(mappedBy = "doctor")
    private List<ClinicHour> clinicHours;
}
