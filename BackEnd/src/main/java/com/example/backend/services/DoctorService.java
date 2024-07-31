package com.example.backend.services;

import com.example.backend.dtos.DoctorDTO;
import com.example.backend.models.Doctor;
import com.example.backend.models.Hospital;
import com.example.backend.repositories.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DoctorService implements IDoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public Doctor createDoctor(DoctorDTO doctorDTO) {
        if (doctorDTO.getUserId() == null) {
            throw new IllegalArgumentException("User ID must be provided.");
        }

        Doctor newDoctor = Doctor.builder()
                .userId(doctorDTO.getUserId())  // Đảm bảo có giá trị cho userId
                .name(doctorDTO.getName())
                .specialization(doctorDTO.getSpecialization())
                .qualification(doctorDTO.getQualification())
                .experienceYears(doctorDTO.getExperienceYears())
                .clinicAddress(doctorDTO.getClinicAddress())
                .file(doctorDTO.getFile())
                .build();

        return doctorRepository.save(newDoctor);
    }

    @Override
    public Doctor getDoctorById(Integer id) {
        Optional<Doctor> doctorOptional = doctorRepository.findById(id);
        return doctorOptional.orElse(null);
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        // Kiểm tra sự tồn tại của bác sĩ trước khi cập nhật
        if (!doctorRepository.existsById(doctor.getUserId())) {
            throw new IllegalArgumentException("Doctor with ID " + doctor.getUserId() + " does not exist.");
        }
        // Cập nhật bác sĩ
        return doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(Integer id) {
        if (!doctorRepository.existsById(id)) {
            throw new IllegalArgumentException("Doctor with ID " + id + " does not exist.");
        }
        doctorRepository.deleteById(id);
    }


}
