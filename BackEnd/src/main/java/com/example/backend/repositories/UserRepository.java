package com.example.backend.repositories;

import com.example.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Các phương thức truy vấn bổ sung nếu cần
    User findByPhoneNumber(String phoneNumber);
}
