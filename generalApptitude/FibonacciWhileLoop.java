package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Scanner;

public class FibonacciWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ending number ");
		int end = scanner.nextInt();
		FibonacciWhileLoop fibonacci = new FibonacciWhileLoop();
		fibonacci.fibonacci(end);
	}

	void fibonacci(int number) {
		int sum = 0;
		int a = 0;
		int b = 1;
		while (number > sum) {
			sum = a + b;
			System.out.println(a);
			a = b;
			b = sum;
		}
		System.out.println(a);
	}

}
