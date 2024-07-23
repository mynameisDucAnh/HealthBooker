package com.example.backend.dtos;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDTO {
    private String name;
    private String description;
    private int vote;
    private MultipartFile file;
}
