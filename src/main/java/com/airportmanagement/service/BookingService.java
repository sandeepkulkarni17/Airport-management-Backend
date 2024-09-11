package com.airportmanagement.service;

import com.airportmanagement.model.Booking;
import com.airportmanagement.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

	public void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public void updateBooking(Long id, Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public Booking getBookingById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}

