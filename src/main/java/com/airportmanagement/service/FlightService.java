package com.airportmanagement.service;

import com.airportmanagement.model.Flight;
import com.airportmanagement.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public Flight updateFlight(Long id, Flight flight) {
        Flight existingFlight = flightRepository.findById(id).orElseThrow();
        existingFlight.setFlightNumber(flight.getFlightNumber());
        existingFlight.setDeparture(flight.getDeparture());
        existingFlight.setDestination(flight.getDestination());
        existingFlight.setDepartureTime(flight.getDepartureTime());
        existingFlight.setArrivalTime(flight.getArrivalTime());
        return flightRepository.save(existingFlight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
