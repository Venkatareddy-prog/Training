package com.examples;

public class FactorialOfNumberUsingRecursion {

	public static void main(String[] args) {
		int n = 5;
		long fact = factorial(n);
		System.out.println("The factorial of " + n + " is " + fact);

	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1; 
		}
		return n * factorial(n - 1);
	}
}