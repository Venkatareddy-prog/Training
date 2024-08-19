package com.examples;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int n = 5;
		long fact = factorial(n);
		System.out.println("The factorial of " + n + " is " + fact);

	}

	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result =result * i;
		}
		return result;
	}
}