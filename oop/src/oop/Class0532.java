package oop;

import java.util.Scanner;

public class Class0532 {
	static int aNumber;
	static Scanner sc = new Scanner(System.in);
	static Integer maxNumber = null;
	public static void N() {
		System.out.println("Input  a number > 0:");
		if (sc.hasNextInt()) {
			aNumber = sc.nextInt();
		}
	}
	public static void searchMax() {
		System.out.println("Input " + aNumber + " numbers");
		final int[] numbers = new int[aNumber];
		for (int i = 0; i < aNumber; i++) {
			if (sc.hasNextInt()) {
				numbers[i] = sc.nextInt();
			}
		}
		maxNumber = numbers[0];
		if ( numbers.length > 1) {
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i] > maxNumber) {
					maxNumber = numbers[i];
				}
			}
		}
		
	}
	
}
