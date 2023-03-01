package com.prowing.string;

public class StringNewObject 
{
public static void main(String[] args) {
	String s1 = new String("hiii");
	String s2 = new String("Hiii");
	String s3 = new String("hiii");
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equals(s3));
	//System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s2==s3);
}
}
