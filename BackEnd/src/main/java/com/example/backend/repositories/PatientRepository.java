package com.example.backend.repositories;

import com.example.backend.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    // Các phương thức truy vấn bổ sung nếu cần
}
