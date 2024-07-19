package com.example.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/hospital")
public class HospitalController {
    @GetMapping("")
    public ResponseEntity<String> getAllHospital(){
        return ResponseEntity.ok("lấy danh sách bệnh viện");
    }
    @PostMapping("")
    public ResponseEntity<String> insertHospital(){
        return ResponseEntity.ok("thêm bệnh viện");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateHospital(@PathVariable int id){
        return ResponseEntity.ok("sửa thông tin bệnh viện");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHospital(@PathVariable int id){
        return ResponseEntity.ok("sửa thông tin bệnh viện");
    }
}
