package com.mouritech.onlineflightticketbookingapplication.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="location")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id" ,length = 64)
    private Long locationId;
  
	@Column(name = "location_country")
	private String locationCountry;
	
	@Column(name = "locationname" ,nullable = false)
	private String locationName;
	
	@Column(name="locationairport",nullable = false)
	private String locationAirport;

	@Column(name="locationcode",nullable = false)
	private String locationCode;
	
	
	public Location() {
		
	}
	

public Location(Long locationId, String locationCountry, String locationName, String locationAirport,
			String locationCode) {
		super();
		this.locationId = locationId;
		this.locationCountry = locationCountry;
		this.locationName = locationName;
		this.locationAirport = locationAirport;
		this.locationCode = locationCode;
	}



      

public Long getLocationId() {
	return locationId;
}


public void setLocationId(Long locationId) {
	this.locationId = locationId;
}


public String getLocationCountry() {
	return locationCountry;
}


public void setLocationCountry(String locationCountry) {
	this.locationCountry = locationCountry;
}


public String getLocationName() {
	return locationName;
}


public void setLocationName(String locationName) {
	this.locationName = locationName;
}


public String getLocationAirport() {
	return locationAirport;
}


public void setLocationAirport(String locationAirport) {
	this.locationAirport = locationAirport;
}


public String getLocationCode() {
	return locationCode;
}


public void setLocationCode(String locationCode) {
	this.locationCode = locationCode;
}


@Override
public String toString() {
	return "Location [locationId=" + locationId + ", locationCountry=" + locationCountry + ", locationName="
			+ locationName + ", locationAirport=" + locationAirport + ", locationCode=" + locationCode + "]";
}


	

	

}