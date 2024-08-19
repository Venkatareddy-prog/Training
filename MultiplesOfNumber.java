package com.examples;

public class MultiplesOfNumber {

	public static void main(String[] args) {
		int numberOfTbales = 15;
		int temp;

		for (int i = 2; i <= numberOfTbales; i++) {
			System.out.println("Multiplication Table for " + i + ":");

			for (int j = 1; j <= 10; j++) {
				temp=i*j;
				System.out.printf(i+" " + " X "+" "+j+" " +"=" + temp);
				System.out.println();
				
			}

		}

	}

}
