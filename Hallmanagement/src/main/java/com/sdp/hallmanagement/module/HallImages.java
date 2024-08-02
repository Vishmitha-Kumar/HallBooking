package com.sdp.hallmanagement.module;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;

@Embeddable
public class HallImages {

    private String imgName;

    @Lob
    @Column(length = 99999999)
    private byte[] data;
    
}
