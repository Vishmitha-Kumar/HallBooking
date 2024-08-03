package com.sdp.hallmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdp.hallmanagement.module.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    
}
