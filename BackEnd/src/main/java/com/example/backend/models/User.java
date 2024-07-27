package com.example.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullname", length = 100, nullable = false, columnDefinition = "VARCHAR(100) DEFAULT ''")
    private String fullName;

    @Column(name = "phone_number", length = 10, nullable = false)
    private String phoneNumber;

    @Column(name = "address", length = 200, columnDefinition = "VARCHAR(200) DEFAULT ''")
    private String address;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "created_at", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @Column(name = "is_active", columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean isActive;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "facebook_account_id", columnDefinition = "INT DEFAULT 0")
    private Integer facebookAccountId;

    @Column(name = "google_account_id", columnDefinition = "INT DEFAULT 0")
    private Integer googleAccountId;

    @Column(name = "role", columnDefinition = "INT DEFAULT 1")
    private Integer role;
}
