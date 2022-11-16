package com.samad.javacodes;

public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to reverse digits of a number
				//original number=12345, output= 54321
				
				int num =56789;
				int reverse = 0;
				while (num!=0) {
					
					int remainder=num %10;
					reverse =reverse*10+num%10;
					num = num/10;
				}

				
				System.out.println("The reverse number is " + reverse);
		
		
		
		
	}

}
