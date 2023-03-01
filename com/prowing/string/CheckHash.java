package com.prowing.string;

public class CheckHash {

long  sallary;
String name;
int id;

public CheckHash() {
}
public CheckHash(long sallary,String name,int id) {
	super();
	this.sallary = sallary;
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "CheckHash [sallary=" + sallary + ",name="+name+",id="+id+"]";
}
@Override
public int hashCode() {
	
	
	int res=1;
	res=(int) (sallary*31+name.hashCode()*31+id*31);
	return res;
}
@Override
public boolean equals(Object obj) {

	CheckHash obj1=(CheckHash)obj;
	boolean res=false;
	if( this.sallary==obj1.sallary) 
	{
		if(this.name==obj1.name) 
		{
			if(this.id==obj1.id) 
				res=true;
		}
	}
	else 
	{
		res= false;
	}
	
	return res;
}
}
