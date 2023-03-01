package com.prowing.string;

public class InternMethod {
	
	public static void main(String[] args) {
		
		String s1= "abhi";
		String s2= new String ("abhi");
		String s3= new String ("khade");
		
		
		System.out.println(s1==s2);
		
		s2=s2.intern();
		
		System.out.println(s1==s2);
		
		String s4=s3.intern();
		System.out.println(s4.equals(s3));
		
		//s3=s3.intern();
		
		System.out.println(s3==s4);
		
		
		
		
		
		
		
	}

}
