package oop;

import java.util.Scanner;

public class Class0622 {

	public void doIt() {
		System.out.println("Enter 5 numbers:");
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int num;
		int tmp;
		for (int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				if (nums[j]  > nums[j + 1]) {
					tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(nums[i]);
		}
	}
}
