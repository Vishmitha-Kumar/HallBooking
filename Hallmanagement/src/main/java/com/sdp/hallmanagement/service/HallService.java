package com.sdp.hallmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.hallmanagement.module.Hall;
import com.sdp.hallmanagement.repository.HallRepository;


@Service
public class HallService {

    @Autowired
    private HallRepository hallRepository;

    public Hall addHalls(Hall hall) {
        return hallRepository.save(hall);
    }
    
}
