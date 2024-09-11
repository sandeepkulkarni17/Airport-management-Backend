package com.airportmanagement.test;

import com.airportmanagement.model.Flight;
import com.airportmanagement.service.FlightService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class FlightServiceTest {

    @Autowired
    private FlightService flightService;

    @Test
    public void testAddFlight() {
        Flight flight = new Flight();
        flight.setFlightNumber("AI123");
        flight.setDeparture("NYC");
        flight.setDestination("LAX");
        Flight savedFlight = flightService.saveFlight(flight);
        assertNotNull(savedFlight);
    }
}
