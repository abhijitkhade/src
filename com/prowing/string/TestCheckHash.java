package com.prowing.string;

public class TestCheckHash {
	public static void main(String[] args) {
		
		
		
		CheckHash obj  = new CheckHash(150000l,"abhi",101);
		CheckHash obj1 = new CheckHash(150000l,"abhi",101);
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		

	}

	}


