package com.example.backend.services;

import com.example.backend.dtos.HospitalDTO;
import com.example.backend.dtos.HospitalImageDTO;
import com.example.backend.models.Hospital;
import com.example.backend.models.HospitalImage;
import jdk.jfr.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IHospitalService {
    Hospital createHospital(HospitalDTO hospital);
    Hospital getHospitalById(Integer id) throws Exception;
    Page<Hospital> getAllHospital(PageRequest pageRequest);
    Hospital updateHospital(Hospital hospital);
    void deleteHospital(Integer id);


    HospitalImage createHospitalImage(Integer id, HospitalImageDTO build) throws Exception;
}
