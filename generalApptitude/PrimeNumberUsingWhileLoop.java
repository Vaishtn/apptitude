package com.xworkz.aptitudeStarPatterns.generalApptitude;

public class PrimeNumberUsingWhileLoop {

	public static void main(String[] args) {
		int i = 2;
		int number = 4;
		int count = 0;

		while (i <= number/2) {
			if (number % i == 0) {
				count++;
				break;
			}
			i++;
		}
		System.out.println("number of itration = "+i );
		if (count == 0) {
			System.out.println("Number is prime");
		} else
			System.out.println("Number not prime");

	}

}
