package com.collection.examples;

import java.util.HashSet;

public class HasEg {
	public static void main(String[] args) {
		/*
		 * HashSet<String> hss= new HashSet<String>(); hss.add("duplicate");
		 * hss.add("bbbbbbb"); hss.add("kghfds"); hss.add("duplicate");
		 * hss.add("aaaaaaa");
		 */
		HashSet<City> hss = new HashSet<City>();
		hss.add(new City("city1", 1234, "capital1"));
		hss.add(new City("city2", 3456, "capital2"));
		hss.add(new City("city2", 3456, "capital2"));
		hss.add(new City("city3", 6547, "capital3"));
		for (City ele : hss) {
			System.out.print(ele + "\n");

		}
	}
		

}
