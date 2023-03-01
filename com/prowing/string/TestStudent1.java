package com.prowing.string;

public class TestStudent1 {
	
	public static void main(String[] args) {
		
		Student1 obj= new Student1("95611926199","india");
		Student1 obj1= new Student1("95611926199", "india");
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		
		
		
		
	}
	

	
	
	}


