package com.apache.hotelroom.service.serviceImpl;

import com.apache.hotelroom.DTO.PhongCanBoDTO;
import com.apache.hotelroom.exception.CanBoAlreadyExistsException;
import com.apache.hotelroom.model.Canbo;
import com.apache.hotelroom.model.Phongcanbo;
import com.apache.hotelroom.service.PhongCanBoService;
import com.apache.hotelroom.repository.PhongCanBoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongCanBoImpl implements PhongCanBoService {
    @Autowired
    private PhongCanBoRepository phongCanBoRepository;

    @Override
    public List<Phongcanbo> getAllRooms() {
        List<Phongcanbo> rooms = phongCanBoRepository.findAll();
        System.out.println("Found rooms: " + rooms.size()); // Debug log
        return rooms;
    }

    @Override
    public Page<PhongCanBoDTO> findByTangId(long tangId, Pageable pageable) {
        Page<Phongcanbo> phongcanboPage = phongCanBoRepository.findByTangId(tangId, pageable);
        return phongcanboPage.map(PhongCanBoDTO::toDTO);
    }

    @Override
    public Canbo addCanBoToPhong(int phongId, Canbo canbo) throws CanBoAlreadyExistsException {
        return null;
    }

    @Override
    public Optional<PhongCanBoDTO> findByRoomId(Integer id) {

        Optional<Phongcanbo> phongcanbo = phongCanBoRepository.findById(id);
        return phongcanbo.map(PhongCanBoDTO::toDTO);

    }
}
