package oop;

import java.util.Scanner;

public class Class0606 {

	Long userInput;
	public void askNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number:");
		if (sc.hasNextLong()) {
			userInput = Math.abs(sc.nextLong());
		} else {
			return;
		}
	}
	public void todoIt(Long a) {
		String b = a.toString();
		String[] digits = b.split("");
		Integer digit;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < digits.length; i++) {
			digit = Integer.parseInt(digits[i]);
			if (digit%2 == 0) { 
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even: " + even + " Odd: " + odd);
	}
}
