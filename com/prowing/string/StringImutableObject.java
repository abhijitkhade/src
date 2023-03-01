package com.prowing.string;

public class StringImutableObject {
public static void main(String[] args) {
	String s1= "hello";
	
	String s2= "hello";
	
	String s3= "hii";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	 System.out.println(s1.equals(s3));
    System.out.println(s1==s3);
}
}
