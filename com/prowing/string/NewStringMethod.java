package com.prowing.string;

public class NewStringMethod {
	public static void main(String[] args) {
		
		String s1= "Abhikhade";
		String s3= "Abhi";
		
		String s4= "khade";
		
		
		System.out.println(s1.length());
		
		String s2= " ";
		
		System.out.println(s2.isEmpty());
		
		System.out.println(s2.isBlank());
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1==s3);
		
		System.out.println(s1.startsWith(s3));
		
		System.out.println(s1.startsWith(s4, 4));
		
		System.out.println(s1.endsWith(s4));
		
		System.out.println(s1.indexOf('A'));

	}


}
