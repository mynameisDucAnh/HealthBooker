package com.example.backend.services;

import com.example.backend.dtos.DoctorDTO;
import com.example.backend.exceptions.DataNotFoundException;
import com.example.backend.models.Doctor;
import com.example.backend.repositories.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService implements IDoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public Doctor createDoctor(DoctorDTO doctorDTO) throws DataNotFoundException {
        if (doctorDTO.getUserId() == null) {
            throw new IllegalArgumentException("User ID must be provided.");
        }

        // Create a new doctor without checking for existing doctor ID
        Doctor newDoctor = Doctor.builder()
                .userId(doctorDTO.getUserId())
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
    public Doctor getDoctorById(Integer id) throws Exception{
        return doctorRepository.findById(id).
                orElseThrow(()->new DataNotFoundException(
                        "Cannot find doctor with id = "+ id));
    }

    @Override
    public Page<Doctor> getAllDoctor(PageRequest pageRequest) {
        return doctorRepository.findAll(pageRequest);
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
