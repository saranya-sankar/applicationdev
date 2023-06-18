package com.sample.applicationdev.loops;

public class Emp {
	int id;  
	String name;  
	Address address;  
	  
	public Emp(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("BBB","Karnataka","india");  
	Address address2=new Address("AAA","Kerala","india");  
	  
	Emp e=new Emp(121,"varun",address1);  
	Emp e2=new Emp(112,"arun",address2);  
	      
	e.display();  
	e2.display();  
	      
	}  

}
