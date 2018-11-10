package com.map;

import java.util.HashMap;
import java.util.Map;

public class AppRunner {

	public static void main(String[] args) {
		

		String output = "";
		
		String inputText  = "ab1cd eF2gH";
		
		String updatedTex = inputText.replaceAll("\\W", "");
		updatedTex = updatedTex.replaceAll("\\d", "");
		updatedTex = updatedTex.toUpperCase();
		
		char[] symbols = updatedTex.toCharArray();
		
		for (int i = 0; i < symbols.length; i++) {

			output += alphabet.get(String.valueOf(symbols[i]));
		}
				
		System.out.println(output);
			

		
	}
}

