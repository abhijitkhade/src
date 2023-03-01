package com.prowing.string;

import java.util.Arrays;

public class ToCharArrayMethod2 {
	public static void main(String[] args) {
		
	
	
	
	String line = "india is my country india have 27 state";

	String []words=line.split(" ");
	
	System.out.println("total numbers of words: "+words.length);
	
	String linewithoutspace=line.replace(" ", "");
	
	System.out.println("total numbers of words: "+linewithoutspace.length());
	
	char [] characters= linewithoutspace.toCharArray();
	
	System.out.println(characters);

	
	System.out.println(Arrays.toString(characters));
	
	
	

}
}	
