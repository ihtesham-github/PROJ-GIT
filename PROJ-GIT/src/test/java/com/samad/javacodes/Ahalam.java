package com.samad.javacodes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahalam {

	public static void main(String[] args) {
		
		//How to separate words from a sentence using java Scanner, ArrayList and while loop
		
		String sentence = "Exercise can help you strengthen your brain";
		Scanner scan = new Scanner(sentence);                //Import Scanner
		ArrayList<String> words = new ArrayList<String>();   //Import ArrayList
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		System.out.println(words);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
