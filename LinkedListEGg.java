package com.collection.examples;

import java.util.*;

class Cityeg{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public Cityeg(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}
	
	//getter, setter - TBD
	
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}
}

public class LinkedListEGg {
public static void main(String[] args) {
	//create List
	List<City> cities = new LinkedList<City>();
	Scanner scnr = new Scanner(System.in);
	//System.out.println("Do you want to enter city details");
	boolean cityTrue= true;
	String icity = "";
	long ipincode = 0;
	String istate = "" ;
	
 while(cityTrue) {
	 System.out.println("Please enter city name");
		 icity = scnr.next();
		
		System.out.println("Please enter pincode");
		 ipincode = scnr.nextLong();
		
		System.out.println("Please enter State name");
		 istate = scnr.next();
		 cities.add(new City(icity, ipincode, istate));
		System.out.println("Do you want to enter one more city details");
		 cityTrue= scnr.nextBoolean();
		
		
		
 }
	
	//add City objects to List
	
	//cities.add(new City(icity, ipincode, istate));		
	//cities.add(new City(icity, ipincode, istate));
	
	//iterate and display
	Iterator<City> itr = cities.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
}
}
