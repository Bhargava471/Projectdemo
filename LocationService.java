package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;

public interface LocationService {
	ResponseEntity<List<Location>> getAllLocations();

	Location insertLocation(Location newLocation);
}