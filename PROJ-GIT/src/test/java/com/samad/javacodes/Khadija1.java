package com.samad.javacodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Khadija1 {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));

		Collections.reverse(colors);
		System.out.println(colors);

		// List<String>fruits = new ArrayList<>(Array.asList("mango", "banana",
		// "apple"));
		// Collections.reverse(fruits);

		// System.out.println(fruits);
		List<String> color1 = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));

		Collections.reverse(colors);
		System.out.println(colors);

		int number = 987654, reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);

//        int numbers = 23456789, reverse1 = 0;
//        while(numbers != 0)
//        {
//        	int remainder = 23456789 % 10;
//        	reverse1 = reverse1 * 10+ remainder;
//        	number = number/10;
//        	System.out.println("The reverse of the given number is:" + reverse1);
		
		//String reverse
		
				String abc = "agsfjgasfjgA";
				String ABC = abc.toUpperCase();
				int length = ABC.length();
				System.out.println(length);
				
			char chArray[] = ABC.toCharArray();
				for (int i=ABC.length()-1; i>=0; i--) 
					System.out.print(chArray[i]);
				//String reverse
				
				String ab = "asdfrewy";
				String AB = ab.toUpperCase();
				int length1 = ab.length();
				System.out.println(length1);
				
				char chaArray[] = AB.toCharArray();
				 for(int i= AB.length()-1;i>=0;i--)
					System.out.println(chaArray[i]);
	}

}
