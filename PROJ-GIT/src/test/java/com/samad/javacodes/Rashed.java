package com.samad.javacodes;

import java.util.Arrays;

public class Rashed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String [] shoe = {"adidas","nike","new balance","reebok","puma"};
    System.out.println(shoe[0]);
    System.out.println(shoe[1]);
    System.out.println(shoe[2]);
    System.out.println(shoe[3]);
    System.out.println(shoe[4]);
    shoe [3]= "under armour";
    System.out.println(shoe[3]);
    System.out.println(shoe.length);
    System.out.println(Arrays.toString(shoe));
	}

}
