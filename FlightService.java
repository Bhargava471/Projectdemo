package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Flight;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightIdAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;



public interface FlightService {
	
	Flight insertFlight(Flight newFlight);
    
	Flight showFlightById(Long flightId) throws FlightNotFoundException;

	List<Flight> showAllFlights();

	Flight updateFlightById(Long flightId, Flight flight) throws FlightNotFoundException;

	void deleteFlightById(Long flightId) throws FlightNotFoundException;


}