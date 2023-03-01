package com.prowing.string;

public class ValueOf {
	
	public static void main(String[] args) {
		
		int i=20;
		
		String s= String.valueOf(i);
		
		System.out.println(s);
		
		System.out.println(s.equals("20"));
		
		
		int x= Integer.parseInt(s);
		System.out.println(x);
		
		
		
	}


}
