package com.sdp.hallmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.hallmanagement.service.ReviewService;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService rs;

    
    
}
