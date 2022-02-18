package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Flight;

import ch.qos.logback.core.status.Status;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

        Optional<Flight> findByFlightId(Long flightId);
		List<Flight> findByFlightDate(Long flightId);
		
		Optional<Flight> findByFlightStatusAndLocation(Long locationId,Status flightStatus);
		List<Flight> findByLocation(Long locationId);
		
	
		
		
}