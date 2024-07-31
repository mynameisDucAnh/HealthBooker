package com.example.backend.services;

import com.example.backend.dtos.HospitalDTO;
import com.example.backend.models.Hospital;
import com.example.backend.repositories.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService implements IHospitalService {
    private final HospitalRepository hospitalRepository;

    @Override
    public Hospital createHospital(HospitalDTO hospitalDTO) {
        // Mapping from DTO to Entity
        Hospital newHospital = Hospital.builder()
                .name(hospitalDTO.getName())
                .description(hospitalDTO.getDescription())
                .file(String.valueOf(hospitalDTO.getFile()))
                .vote(hospitalDTO.getVote())
                .build();
        return hospitalRepository.save(newHospital);
    }

    @Override
    public Hospital getHospitalById(Integer id) {
        // Using orElseThrow to handle the case when a hospital is not found
        return hospitalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hospital not found with ID: " + id));
    }

    @Override
    public List<Hospital> getAllHospital() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital updateHospital(Hospital hospital) {
        // Fetch the existing hospital
//        Hospital existingHospital = getHospitalById();
//
//        // Update the hospital's details with the new DTO values
//        existingHospital.setName(hospital.getName());
//        existingHospital.setDescription(hospital.getDescription());
//        existingHospital.setFile(String.valueOf(hospital.getFile()));
//        existingHospital.setVote(hospital.getVote());

        // Save the updated hospital
        return hospitalRepository.save(hospital);
    }

    @Override
    public void deleteHospital(Integer id) {
        // Check if the hospital exists before deleting
        Hospital hospital = getHospitalById(id);
        hospitalRepository.delete(hospital);
    }
}
