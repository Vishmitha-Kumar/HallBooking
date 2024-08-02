package com.sdp.hallmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdp.hallmanagement.module.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {

    

    
}
