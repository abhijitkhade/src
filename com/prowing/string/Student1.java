package com.prowing.string;


public class Student1 {

	public Student1() {
	}
 String mobNo;
 String country;
 
 public Student1(String mobNo,String country) {
	 super();
	 this.mobNo=mobNo;
	 this.country=country;
	 
	}
 public String toString() {
	 return "Student1[mobNo="+mobNo+",country="+country+"]";
	 
 }
@Override
public int hashCode() {
	int res=1;
	res= (mobNo.hashCode()*31+country.hashCode()*31);
	return res;
}
@Override
public boolean equals(Object obj) {
	Student1 obj1= (Student1)obj;
	boolean res=false;
	if(this.mobNo==obj1.mobNo)
	{
		if(this.country.equals(country))
	res=true;
	}
	else 
	{
		res=false;
		
	}
	return res;
	
 
}
}
