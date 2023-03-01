package com.prowing.string;

public class StudentMethod {
	int rollno;
	String name;
	public StudentMethod(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		
		
	}
	public StudentMethod() {
		super();
	}
	public String toString(StudentMethod obj1) {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		int res =1;
		res = rollno*31 + name.hashCode()*31;
		return res;
	}
	@Override
	public boolean equals (Object obj) {
		
		StudentMethod obj1=(StudentMethod)obj;
		
		boolean res= false;
		
		if (this.rollno==obj1.rollno) {
			if (this.name.equals(obj1.name));
			res= true;
		}
		else {
			res = false;
			
		}
		
		return res;
		
	

	}

}
