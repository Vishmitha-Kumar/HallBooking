package com.sdp.hallmanagement.module;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String occasion;
    private int guest;
    private Long contact;
    private Long budge;
    private String food;
    @Temporal(TemporalType.DATE)
    private Date fromdate;
    @Temporal(TemporalType.DATE)
    private Date todate;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User users;

    @ManyToOne
    @JoinColumn(name="hall_id")
    private Hall halls;

    public Booking() {
    }

    public Booking(Long id, String occasion, int guest, Long contact, Long budge, String food, Date fromdate,
            Date todate,  Hall hall) {
        this.id = id;
        this.occasion = occasion;
        this.guest = guest;
        this.contact = contact;
        this.budge = budge;
        this.food = food;
        this.fromdate = fromdate;
        this.todate = todate;
     
        this.halls = halls;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public Long getBudge() {
        return budge;
    }

    public void setBudge(Long budge) {
        this.budge = budge;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

  

    public Hall getHall() {
        return halls;
    }

    public void setHall(Hall halls) {
        this.halls = halls;
    }
   
    
    
}
