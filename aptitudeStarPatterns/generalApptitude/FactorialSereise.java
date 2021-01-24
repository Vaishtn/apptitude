package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Scanner;

public class FactorialSereise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting number");
		int start = scanner.nextInt();
		System.out.println("Enter ending number");
		int end = scanner.nextInt();

		FactorialRecursion recursion = new FactorialRecursion();
		int factorial = recursion.factorial(start);
		System.out.println(factorial);
		while (start <= end) {
			factorial = factorial * (++start);
			System.out.println(factorial);
		}
		
		while (start <= end) {
			int factorial1 = recursion.factorial(start);
			System.out.println(factorial1);
		}
	}

}
