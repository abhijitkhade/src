package com.prowing.string;

public class StringMethods {
	
	public static void main(String[] args) {
		String s= "Abhi";
		System.out.println(s.length());
		
		String s1= "";
		System.out.println(s1.isEmpty());
		
		
		String s2= " ";
		System.out.println(s2.isEmpty());
		
		String s3= "";
		System.out.println(s3.isBlank());
		
		String s4= "Abhi";
		System.out.println(s4.charAt(0));
		
		String s5= "Abhi";
		String s6= "abhi";
		System.out.println(s5.equalsIgnoreCase(s6));
		
		String s7="abhijit";
		String s8="abhijitkhade";
		String s9= "khade";
		System.out.println(s8.startsWith(s7));
		System.out.println(s8.endsWith(s9));
		System.out.println(s8.indexOf('b'));
		
		String s10= "1234Abhi567";
		System.out.println(s10.indexOf('A'));
		
		
		
		
	}

	}


