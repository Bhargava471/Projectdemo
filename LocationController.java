package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlineflightticketbookingapplication.entity.Location;
//import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.LocationRepository;
import com.mouritech.onlineflightticketbookingapplication.service.LocationService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("location/api/v1")
public class LocationController {
	@Autowired
	LocationRepository locationRepository;
	@Autowired
	private LocationService locationService;

	@GetMapping("/users")
	public ResponseEntity<List<Location>> getAllLocations(){
		return locationService.getAllLocations();
	}
	@PostMapping("/locations")
	public Location insertLocation(@RequestBody Location newLocation) {
		
		return locationService.insertLocation(newLocation);
		
	}
	
}