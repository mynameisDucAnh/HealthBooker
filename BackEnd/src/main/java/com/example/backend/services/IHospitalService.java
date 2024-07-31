package com.example.backend.services;

import com.example.backend.dtos.HospitalDTO;
import com.example.backend.models.Hospital;
import jdk.jfr.Category;

import java.util.List;

public interface IHospitalService {
    Hospital createHospital(HospitalDTO hospital);
    Hospital getHospitalById(Integer id);
    List<Hospital> getAllHospital();
    Hospital updateHospital(Hospital hospital);
    void deleteHospital(Integer id);
}
