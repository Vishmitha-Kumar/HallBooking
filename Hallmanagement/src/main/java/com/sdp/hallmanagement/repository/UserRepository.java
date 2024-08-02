package com.sdp.hallmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdp.hallmanagement.module.User;

public interface UserRepository extends JpaRepository<User,Long>{

    User findByEmail(String email);

    

    
}
