package com.samad.javacodes;

public class Samad {

	public static void main(String[] args) {
		
		
		//Counting number of words in a sentence or a paragraph.
		
		String s="Instruction for everybody: Please open a java class by your name in your respective branch and write various important java codes.";
		
		int count=1;		
		for (int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!= ' ') 
			  {count++;}
			}
		System.out.println("Number of words:" + count);		
		
		//Instruction for everybody: Please open a java class by your name in your respective branch and write various important java codes. 
	
	//Swapping two numbers
		
		int x = 176345;
		int y = 785;
		int temp;
		System.out.println("x= "+x+";  " + "y= "+ y);
		temp = x;
		x=y;
		y = temp;
		
		System.out.println("x= "+x+";  " + "y= "+ y);
		
	//Fibonacci sequence for n times where n=10
		
		int f1= 0, f2=1, f3 = 0, n=10;
		
		System.out.print(f1+", "+f2+ ", ");
		
		for (int i=f3; i<n-2; i++) {
			f3 = f1 + f2;
			f1=f2;
			f2=f3;
			System.out.print(f3+", ");	
		}
		
		
	
	
	
	
	
	
	}

}
