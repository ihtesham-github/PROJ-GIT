package com.samad.javacodes;

import java.util.ArrayList;
import java.util.Collections;

public class Ahalam_2 {

	public static void main(String[] args) {

		// Creating an ArrayList object
		ArrayList<String> arrlist = new ArrayList<String>();
		
		//Adding elements to ArrayList object
		
		 arrlist.add("Amazon");
		 arrlist.add("Ebay");
		 arrlist.add("Facebook");
		 arrlist.add("Google");
		 arrlist.add("IBM");
		 arrlist.add("Tesla");
		 arrlist.add("Apple");
		 
		 // Display ArrayList before Reverse
		 
		 System.out.println("ArrayList before Reverse :");
		 System.out.println(arrlist);
		 
		 /*Reversing the list using Collections.reverse() method*/
		 
		 Collections.reverse(arrlist);          //Import Collection
		 
		 // Display list after reverse
		 System.out.println("After Reverse ArrayList");
		 System.out.println(arrlist);
		 
		 
		 /* Output-ArrayList before Reverse :
           [Amazon, Ebay, Facebook, Google, IBM, Tesla, Apple]
           After Reverse ArrayList
           [Apple, Tesla, IBM, Google, Facebook, Ebay, Amazon]*/


		
		
		
		
		
		
		
		
		
		
		
	}

}
