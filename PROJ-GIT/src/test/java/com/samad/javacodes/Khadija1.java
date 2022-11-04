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
	}

}
