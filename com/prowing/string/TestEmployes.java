package com.prowing.string;

public class TestEmployes {
	
	public static void main(String[] args) {
		Employes obj   = new Employes(102,"Shubham",15000.0);
		Employes obj1  = new Employes(102,"Shubham",15000.0);
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		

	}  

}
