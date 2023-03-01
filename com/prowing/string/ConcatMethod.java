package com.prowing.string;

public class ConcatMethod {
	public static void main(String[] args) {
		
	
	
	String s1= "Abhi";
	String s2= "khade";
	String s3= "Abhikhade";
	
	String s4= "";
	String s5= s1.concat(s2);
	String s6= s3.concat(s4);
	String s7= s3+s4;
	
	String s8= new String("Abhikhade");
	String s9 = s8+s4;
	
	//System.out.println(s8==s9);
	
	System.out.println(s3==s7);
	//System.out.println(s3==s4);
	//System.out.println(s4);
	
	
//	System.out.println(s5);
//	System.out.println(s3==s5);
//	System.out.println(s6);
	System.out.println(s3==s6);
//	
	
	
		
	
	}
	
	
	
	

	}


