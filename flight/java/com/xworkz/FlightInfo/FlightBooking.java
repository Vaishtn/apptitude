package com.xworkz.FlightInfo;

import java.util.Scanner;

import com.xworkz.FlightInfo.constants.Company;

public class FlightBooking {
	public FilghtDTO[] flightArray=new FilghtDTO[10];
	private int filghtCount=0;
	
	public void addFlight(String airplaneCode,Company Companyname,String startingPoint,String destination,int totalSeats, boolean domestic, double businessClassPrize,double economyClassPrize) {
		FilghtDTO filghtDTO=new FilghtDTO();
		
		if(this.flightArray.length<=this.filghtCount) {
			this.flightArray[filghtCount]=filghtDTO;
			filghtCount++;
			
		}else {
			System.out.println("flight are full");
		}
	}
	
	
	public void addFlight(FilghtDTO flight) {
		if(this.flightArray.length>=this.filghtCount && flight!=null) {
			System.out.println("invoked first if");
			if(flight.getAirplaneCode()!=null && flight.getCompanyname()!=null && flight.getBusinessClassPrize()!=0 && flight.getStartingPoint()!=null 
					&& flight.getBusinessClassPrize()>=1000) {
				System.out.println("invoked second if");
				this.flightArray[filghtCount]=flight;
				filghtCount++;
			}else {
				System.out.println("condition failed");
			}
		}else {
			System.out.println("flight are full");
		}
	}
	public void searchFlightByStartingPoint(String startingPoint) {
		for(int i=0;i<flightArray.length;i++) {
			if(flightArray[i]!=null) {
				if(flightArray[i].getStartingPoint().equals(startingPoint)) {
					System.out.println(flightArray[i].getStartingPoint()+" "+flightArray[i].getDestination()+" "+flightArray[i].getBusinessClassPrize()+" "+flightArray[i].getCompanyname()+" "+flightArray[i].getAirplaneCode()+" "+flightArray[i].getEconomyClassPrize()+""+flightArray[i].getTotalSeats());
					
				}else {
					System.out.println("flight not available at starting point");
				}
			}
			
		}
	}
	public void displayFlight() {
		for(int i=0;i<filghtCount;i++) {
			if(flightArray[i]!=null) {
				System.out.println("airplaneCode is "+flightArray[i].getAirplaneCode()+" "+"company is "+flightArray[i].getCompanyname()+" "+"starting point"+flightArray[i].getStartingPoint()+" "+"Destination is" +flightArray[i].getDestination()+" "+"TotalSeats is"+flightArray[i].getTotalSeats()+" "+"BussinessClassPrice"+flightArray[i].getBusinessClassPrize()+" "+"Economy prize"+flightArray[i].getEconomyClassPrize());
				
			}
			}
		}
	}
	

 