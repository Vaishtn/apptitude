package com.xworkz.aptitudeStarPatterns.alphabets;

import java.util.Scanner;

public class FibonacciWhileLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int start=scanner.nextInt();
	}
	public int fibonacci(int number) {
		int fibonacci=0;
		int a=0;
		int b=1;
		while(number>fibonacci) {
			System.out.print(a);
			fibonacci=a+b;
			a=b;
			b=fibonacci;
		}
		System.out.print(fibonacci);
		return b;
	}

}
