package com.xworkz.FlightInfo;

import com.xworkz.FlightInfo.constants.Company;

public class FilghtDTO {
	private String airplaneCode;
	private Company Companyname;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrize;
	private double economyClassPrize;
	
	public FilghtDTO() {
		
	}
	public FilghtDTO(String airplaneCode, Company companyname, String startingPoint, String destination, int totalSeats,
			boolean domestic, double businessClassPrize, double economyClassPrize) {
		super();
		this.airplaneCode = airplaneCode;
		Companyname = companyname;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.domestic = domestic;
		this.businessClassPrize = businessClassPrize;
		this.economyClassPrize = economyClassPrize;
	}
	
	
	
	public String getAirplaneCode() {
		return airplaneCode;
	}
	
	public Company getCompanyname() {
		return Companyname;
	}
	
	public String getStartingPoint() {
		return startingPoint;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public int getTotalSeats() {
		return totalSeats;
	}
	
	public boolean isDomestic() {
		return domestic;
	}
	
	public double getBusinessClassPrize() {
		return businessClassPrize;
	}
	
	public double getEconomyClassPrize() {
		return economyClassPrize;
	}
	
	
	
	
}
