package com.apache.hotelroom.service.serviceImpl;

import com.apache.hotelroom.model.Phongcanbo;
import com.apache.hotelroom.service.PhongCanBoService;
import com.apache.hotelroom.repository.PhongCanBoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongCanBoImpl implements PhongCanBoService {
    @Autowired
    private PhongCanBoRepository phongCanBoRepository;
    @Override
    public List<Phongcanbo> getAllRooms() {
        return phongCanBoRepository.findAll();
    }

    @Override
    public Page<Phongcanbo> findByTangId(long tangId, Pageable pageable) {
        return phongCanBoRepository.findByTangId(tangId, pageable);
    }
}