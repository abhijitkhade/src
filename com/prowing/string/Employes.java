package com.prowing.string;

public class Employes {
	
	int id;
	String name;
	double sallary;
	
	public Employes() {
		super();
	}
	
	
	
	public Employes(int id,String name, double sallary) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}
	
	
	public String toString() {
		return "Employes [id=" + id + ",name="+ name +",sallary=" + sallary +  "]";
	}
	
	@Override
	public int hashCode() {
		int res =1;
		
		 res = (int) (id*31 +name.hashCode()*31+sallary*31);
		 
		 return res;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employes obj1 = (Employes)obj;
		
		boolean res = false;
		
		if (this.id == obj1.id) 
		{
			if (this.name.equals(obj1.name))
			{
				
			  if (this.sallary == obj1.sallary)
			
			  res=true;
			  
			}
			
		}
		else 
		{
			res=false;
		}
		return res;
		}
	}
