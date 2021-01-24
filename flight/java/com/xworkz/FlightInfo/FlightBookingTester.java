package com.xworkz.FlightInfo;

import com.xworkz.FlightInfo.constants.Company;

public class FlightBookingTester {
	
	
	public static void main(String[] args) {
		FlightBooking flightBooking =new FlightBooking();
		FilghtDTO flightdto=new FilghtDTO("adr",Company.AIRASIA,"MLR","ghjn", 140,true, 1500,30);
		FilghtDTO flightdto1=new FilghtDTO("adr",Company.AIRASIA,"MLR","ghjn", 140,true, 1500,30);
		
		flightBooking.addFlight(flightdto);
		flightBooking.addFlight(flightdto1);
		
		flightBooking.searchFlightByStartingPoint("Banglore");
		
		
		
		
		
		
	}
	

}
