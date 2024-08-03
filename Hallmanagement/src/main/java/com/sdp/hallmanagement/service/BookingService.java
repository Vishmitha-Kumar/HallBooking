package com.sdp.hallmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdp.hallmanagement.module.Booking;
import com.sdp.hallmanagement.module.Hall;
import com.sdp.hallmanagement.module.User;
import com.sdp.hallmanagement.repository.BookingRepository;
import com.sdp.hallmanagement.repository.HallRepository;
import com.sdp.hallmanagement.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private HallRepository hallRepository;

    @Autowired
    private UserRepository userRepository;

    public Booking bookHalls(Booking booking) {
        Optional<User> user = userRepository.findById(booking.getUsers().getId());
        Optional<Hall> hall = hallRepository.findById(booking.getHalls().getId());

        if (user.isPresent() && hall.isPresent()) {
            booking.setUsers(user.get());
            booking.setHalls(hall.get());
            return bookingRepository.save(booking);
        } else {
            throw new RuntimeException("User or Hall not found");
        }
    }
    
    public List<Booking> getAllBooking() {
      return bookingRepository.findAll();
    }
    
    public Optional<Booking> getBooking(Long id) {
        return bookingRepository.findById(id);
        
    }
    public Booking updateBooking(Booking booking) {
        Optional<Booking> existingBooking = bookingRepository.findById(booking.getId());
        
        if (existingBooking.isPresent()) {
            Booking updatedBooking = existingBooking.get();
            
            // Update fields
            updatedBooking.setOccasion(booking.getOccasion());
            updatedBooking.setGuest(booking.getGuest());
            updatedBooking.setContact(booking.getContact());
            updatedBooking.setBudget(booking.getBudget());
            updatedBooking.setFood(booking.getFood());
            updatedBooking.setFromdate(booking.getFromdate());
            updatedBooking.setTodate(booking.getTodate());
            
            // Ensure the related User and Hall are set
            Optional<User> user = userRepository.findById(booking.getUsers().getId());
            Optional<Hall> hall = hallRepository.findById(booking.getHalls().getId());

            if (user.isPresent() && hall.isPresent()) {
                updatedBooking.setUsers(user.get());
                updatedBooking.setHalls(hall.get());
                return bookingRepository.save(updatedBooking);
            } else {
                throw new RuntimeException("User or Hall not found");
            }
        } else {
            throw new RuntimeException("Booking not found");
        }
    }
}

