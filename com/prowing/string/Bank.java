package com.prowing.string;


public class Bank {

	public Bank() {
	}
 String name;
 String accNo;
 public Bank (String name,String accNo) {
	 super();
	 
	 this.name=name;
	 this.accNo=accNo;
 }
 public String toString()
 {
	 return "Bank[name="+name+",accNo="+accNo+"]";
	 
 }
@Override
public int hashCode() {
	
	int res=1;
	res= (name.hashCode()*31+accNo.hashCode()*31);
	return res;
	
	
}
@Override
public boolean equals(Object obj) {
	
	Bank obj1=(Bank)obj;
	//boolean res=false;
	if (this.name==obj1.name)
	{
		if(this.accNo==obj1.accNo)
	return true;
	}

else
{ 
	return false;
	
}
	return false;
	
	 
 }
}

