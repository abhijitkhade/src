package com.prowing.string;

public class StringEquality {
	public static void main(String[] args) {
		String S1=new String("hii");
		String S2= "hello";
		String S3= "hello";
		String S4=new String("hello");
		
		System.out.println(S1.equals(S2));
		System.out.println(S1.equals(S3));
		System.out.println(S2.equals(S4));
		System.out.println(S1==S2);
		System.out.println(S2==S3);
		System.out.println(S1==S3);
		System.out.println(S1==S4);
	}

	
	
}
