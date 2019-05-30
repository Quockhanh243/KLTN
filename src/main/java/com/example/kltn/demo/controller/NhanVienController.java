package com.example.kltn.demo.controller;

import com.example.kltn.demo.entity.NhanvienEntity;
import com.example.kltn.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RequestMapping("/api/nhanvien")
@RestController
public class NhanVienController {
    @Autowired
    NhanVienRepository nhanVienRepository;

    @GetMapping("/danhsach")
    public List<NhanvienEntity> getAll(){
        return (List<NhanvienEntity>) nhanVienRepository.findAll();
    }

//    @GetMapping(value = "/xoa/{id}")
//    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
//        System.out.println("Delete Employee With ID = "+id+"..............");
//        return nhanVienService.deleteEmployee(id);
//    }cx
//
//    @GetMapping("/detail/{id}")
//    public NhanVien getEmployeeByID(@PathVariable("id") int id){
//        System.out.println("Get Employee With ID = "+id+"........");
//        return nhanVienService.getEmployeeByID(id);
//    }

}
