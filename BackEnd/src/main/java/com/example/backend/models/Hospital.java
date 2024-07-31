package com.example.backend.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Table(name = "hospital")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;


    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    private Integer vote;

    private String file;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Doctor> doctors;
}
