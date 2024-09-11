package com.apache.hotelroom.repository;

import com.apache.hotelroom.model.Phongcanbo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhongCanBoRepository extends JpaRepository<Phongcanbo, Integer> {

    Page<Phongcanbo> findByTangId(long tangId, Pageable pageable);
}