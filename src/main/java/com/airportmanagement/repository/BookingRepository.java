package com.airportmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportmanagement.model.Booking;

public interface BookingRepository extends JpaRepository<Booking , Long> {

}
