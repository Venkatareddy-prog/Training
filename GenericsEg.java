package com.collection.examples;

//Generic class
class Wrapper<T> {
	T data;

	// setter
	void setData(T data) {
		this.data = data;
	}

	// getter
	T getData() {
		return data;
	}
}

public class GenericsEg {
public static void main(String[] args) {
	Wrapper<String> ws = new Wrapper<String>();
	//...
	
	Wrapper<City> wc = new Wrapper<City>();
	//...
}
}
