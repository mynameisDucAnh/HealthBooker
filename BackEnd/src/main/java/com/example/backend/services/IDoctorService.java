package com.example.backend.services;

import com.example.backend.dtos.DoctorDTO;
import com.example.backend.models.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;


public interface IDoctorService {
    public Doctor createDoctor(DoctorDTO doctorDTO);
    Doctor getDoctorById(Integer id);
    List<Doctor> getAllDoctor();
    Doctor updateDoctor(Doctor doctor);
    void deleteDoctor(Integer id);


}
