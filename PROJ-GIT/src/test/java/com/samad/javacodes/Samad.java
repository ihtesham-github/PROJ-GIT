package com.samad.javacodes;

public class Samad {

	public static void main(String[] args) {
		
		
		String s="Instruction for everybody: Please open a java class by your name in your respective branch and write various important java codes.";
		
		int count=1;		
		for (int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!= ' ') 
			  {count++;}
			}
		System.out.println("Number of words:" + count);		
		
		//Instruction for everybody: Please open a java class by your name in your respective branch and write various important java codes. 
	}

}
