package com.prowing.string;

public class ObjectEqualMethod {
	public ObjectEqualMethod(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ObjectEqualMethod s1= new ObjectEqualMethod(101,"ram");
		ObjectEqualMethod s2= new ObjectEqualMethod(101,"ram");
		ObjectEqualMethod s3= s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "ObjectEqualMethod []";
	}

	
	}


