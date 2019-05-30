package com.example.kltn.demo.repository;

import com.example.kltn.demo.entity.NhanvienEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanvienEntity, Integer> {
}
