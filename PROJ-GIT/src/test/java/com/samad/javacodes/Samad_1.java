package com.samad.javacodes;

public class Samad_1 {

	public static void main(String[] args) {
		
		//String reverse
		
		String abc = "agsfjgasfjgA";
		String ABC = abc.toUpperCase();
		int length = ABC.length();
		System.out.println(length);
		
	char chArray[] = ABC.toCharArray();
		for (int i=ABC.length()-1; i>=0; i--) 
			System.out.print(chArray[i]);
	}

}
