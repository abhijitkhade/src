package com.prowing.string;

public class TestBank {
	public static void main(String[] args) {
		
		Bank obj= new Bank("HDFC","923456789");
		Bank obj1= new Bank("HDFC","923456789");
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj1==obj);
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}


}
