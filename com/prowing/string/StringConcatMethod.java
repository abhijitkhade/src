package com.prowing.string;

public class StringConcatMethod {
	public static void main(String[] args) {
		String s1="helloword";
		String s2= "hello";
		String s3= "hello";
		String s4= s2.concat(s3);
		String s5 = "wold";
		String s6= s2+s3;
		//total object 5
		System.out.println(s1==s5);
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s2==s3);
	}

}
