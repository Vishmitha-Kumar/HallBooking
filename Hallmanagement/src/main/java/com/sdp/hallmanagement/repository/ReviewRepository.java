package com.sdp.hallmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdp.hallmanagement.module.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review ,Long>{

    
    
}
