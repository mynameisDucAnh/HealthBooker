package com.example.backend.repositories;

import com.example.backend.models.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {
    // Các phương thức truy vấn bổ sung nếu cần
}
