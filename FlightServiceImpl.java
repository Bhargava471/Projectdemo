package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Flight;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightIdAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.FlightNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.LocationNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.FlightRepository;


@Service
public class FlightServiceImpl implements FlightService{
	@Autowired
	private FlightRepository  flightRepository;
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Flight insertFlight(Flight newFlight) {
		newFlight.setFlightId(generateFlightId());
		return flightRepository.save(newFlight);
	}
	public Long generateFlightId() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 255;
	        //generate random values from 0-254
	      Long fId = (long) rand.nextInt(upperbound);
		return  fId; 
	
	}
	@Override
	public Flight showFlightById(Long flightId) throws FlightNotFoundException {
		return flightRepository.findByFlightId(flightId).orElseThrow(() -> new FlightNotFoundException("flight not found with id " + flightId));
	}
	@Override
	public List<Flight> showAllFlights() {
		return flightRepository.findAll();
	}
	@Override
	public Flight updateFlightById(Long flightId, Flight flight) throws FlightNotFoundException {
		Flight existingFlight = flightRepository.findByFlightId(flightId).orElseThrow(() -> new FlightNotFoundException("flight not found with id " + flightId));
		existingFlight.setFlightStatus(flight.getFlightStatus());
		existingFlight.setFlightFleet(flight.getFlightFleet());
		flightRepository.save(existingFlight);
		return existingFlight;
	}
	@Override
	public void deleteFlightById(Long flightId) throws FlightNotFoundException {
		Flight existingFlight = flightRepository.findByFlightId(flightId).orElseThrow(() -> new FlightNotFoundException("flight not found with id " + flightId));
		flightRepository.delete(existingFlight);
		
	}
}