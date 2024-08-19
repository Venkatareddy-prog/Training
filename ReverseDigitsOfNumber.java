package com.examples;

public class ReverseDigitsOfNumber {

	public static void main(String[] args) {
		int number = 200309098;
		System.out.println("The digits in reverse order of a number:"+number+" "+"is");
		System.out.println(reverseDigits(number));

	}

	public static long reverseDigits(int number) {
		
int reversed=0;
		while (number != 0) {
			int digit = number % 10;
			 reversed = reversed * 10 + digit;
			number = number / 10;
		}
		return reversed;
		
	}
}
