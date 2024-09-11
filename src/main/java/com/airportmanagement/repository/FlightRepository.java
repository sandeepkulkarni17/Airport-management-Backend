package com.airportmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportmanagement.model.Flight;


public interface FlightRepository extends JpaRepository<Flight , Long> {

}
