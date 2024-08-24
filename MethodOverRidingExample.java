package com.examples;

class Product {

	int id;
	String name;

	void display() {
		System.out.println("product.display()");
	}
	
	public String toString() {
		return "id="+id +" name="+name ;
	}
}

class ElectronicProduct extends Product {
	float voltage;

	void display() {
		System.out.println("Electronic product.display()");
	}
	

}

public class MethodOverRidingExample {

	public static void main(String[] args) {
		Product obj = new ElectronicProduct();
		/*
		 * Method overriding- Same Declaration(Method name, parameters and same retun
		 * type) or dynamic polymorphisim
		 * 
		 * 
		 */
		obj.display(); // display of derived class
		obj = new Product();
		obj.display(); // display of base
		Product obj1 = new Product();
		System.out.println("Diplay Product obj is" + obj1.toString());
		Object ob = new ElectronicProduct();
		ob.getClass();
		
	}
	

}