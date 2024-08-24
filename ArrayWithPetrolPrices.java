package com.examples;

public class ArrayWithPetrolPrices {

	public static void main(String[] args) {

		float[] prates = { 98.7f, 68.7f, 112.15f, 98f, 103.2f, 111f };

		int temp = 0;
		int n = prates.length;

		for (int i = 1; i <= n; i++) {
			temp += prates[i];
		}

		float avgPrate = temp / n;

		System.out.printf("The average petrol price in the 6 metro cities is: ", avgPrate);
	}
}