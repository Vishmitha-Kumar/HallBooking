package com.sdp.hallmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.hallmanagement.module.Hall;
import com.sdp.hallmanagement.service.HallService;

@RestController
@RequestMapping("/api/hall")
public class HallController {

    @Autowired
    private HallService hallService;


    @PostMapping("/addHalls")
    public ResponseEntity<?> addHalls(@RequestBody Hall halls){
            return new ResponseEntity<>(hallService.addHalls(halls), HttpStatus.CREATED);
    } 
    
    

    
}
