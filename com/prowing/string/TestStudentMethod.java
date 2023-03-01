package com.prowing.string;

public class TestStudentMethod    {
	
	public static void main(String[] args) {
		StudentMethod obj1= new StudentMethod(101,"ram");
		StudentMethod obj= new StudentMethod(102,"ram");
		
		System.out.println(obj.equals(obj1));
		
		System.out.println(obj==obj1);
		
		System.out.println(obj.toString(obj));
		System.out.println(obj.toString(obj));
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		
	}

	}


