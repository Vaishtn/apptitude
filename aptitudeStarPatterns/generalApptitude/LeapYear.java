package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your year");
		int year = scanner.nextInt();
		
		LeapYear leapYear = new LeapYear();
		String statement=leapYear.isLeapYear(year);
		System.out.println(statement);
	}
	
	public String isLeapYear(int year) {
		
		if (year % 4==0 && year % 100 !=0 || year % 400 == 0) {
			return "The year is leap year";
		}
		else {
			return "the year is not leap year";
		}
	}

}
