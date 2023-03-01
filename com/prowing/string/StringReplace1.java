package com.prowing.string;

public class StringReplace1 {
	
	public static void main(String[] args) {
		String s1="I am Abhi khade";
		System.out.println(s1.replace("Abhi", "Shubham"));
		
		
		String []words=s1.split(" ");
		
		for (String word:words) {
			System.out.println(word);
			
			//System.out.println(s1.split("s1"));
		}
		
		String massage=String.join(" ", "java","abhi");
		System.out.println(massage);
		
		
		String s2= "hello";
		String s3= "hello   " ;
		System.out.println(s2.trim());
		System.out.println(s3.trim());
		
		
		
		
		
		
	}
       
	}


