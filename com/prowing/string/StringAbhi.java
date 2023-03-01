package com.prowing.string;

public class StringAbhi {

	public void m1 (char...c) {
		System.out.println("char...abhi");
	}


	public static void main(String... args) {

		StringAbhi s1 = new StringAbhi();

		// String s1 = new String ("abhi");
		// s1.m1(10);
		
//		s1.m1();

//		Long i = 10l;
		s1.m1('a', 'b', 'c');
//		s1.m1(i);
	}
}
