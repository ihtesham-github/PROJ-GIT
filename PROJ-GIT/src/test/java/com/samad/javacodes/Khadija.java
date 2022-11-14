package com.samad.javacodes;

public class Khadija {

	// public static void main(String[] args) {
	// Adding natural numbers upto given digit

	public void addNumbers(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum = sum + i;
		}

		System.out.println("Sum od upto " + a + ": + sum");

		int numbers = 23456789, reverse = 0;
		while (numbers != 0) {
			int numbers1 = 23456789 % 10;
			int remainder = 0;
			reverse = reverse * 10 + remainder;
			numbers1 = numbers1 / 10;
			System.out.println("The reverse of the given number is:" + reverse);

		}
	}
}
