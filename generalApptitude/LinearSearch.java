package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of values you want");
		int number = scanner.nextInt();
		int numbers[]=new int[number]; 
		System.out.println("Enter the values");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]= scanner.nextInt();
		}
		
		System.out.println("enter the value that you want to search");
		int searchNumber = scanner.nextInt();
		
		LinearSearch linearSearch= new LinearSearch();
		boolean result=linearSearch.toSearch(numbers,searchNumber);		
		if (result ) {
			System.out.println("value found");
		}
		else {
			System.out.println("value not found");
		}
	}
	
boolean toSearch(int []numbers , int searchNumber){
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i);
			if (searchNumber == numbers[i]) 
				return true;
		}
		return false;
	}

}
