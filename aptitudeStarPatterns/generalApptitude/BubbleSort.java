package com.xworkz.aptitudeStarPatterns.generalApptitude;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of values");
		int num = scanner.nextInt();
		int[] numbers = new int[num];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		BubbleSort bubbleSort = new BubbleSort();
		numbers = bubbleSort.bubbleSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
	}

	public int[] bubbleSort(int[] numbers) {
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

}
