package com.examples;

public class ArrayExample {
	public static void main(String[] args) {
		int pincome[] = new int[5];
		pincome[0] = 32;
		pincome[1] = 21;
		pincome[2] = 11;
		pincome[3] = 41;
		pincome[4] = 15;
		print(pincome);
		reverse(pincome);
		print(pincome);
		for (int i = 0; i < pincome.length; i++) {
			System.out.println("PerCapita income of city" + i + "is " + pincome[i]);

		}
		for (int i = pincome.length - 1; i >= 0; i--) {
			System.out.println("(from last)PerCapita income of city" + i + "is " + pincome[i]);

		}
		int min_pincome = pincome[0];
		for (int i = pincome.length - 1; i >= 0; i--) {
			if (min_pincome > pincome[i])
				min_pincome = pincome[i];

		}

		int max_pincome = pincome[0];
		for (int i = pincome.length - 1; i >= 0; i--) {
			if (max_pincome < pincome[i])
				max_pincome = pincome[i];

		}
		System.out.println("Maximum income is " + max_pincome);
		int minpincome = minincome(pincome);
		System.out.println("minimum income is " + minpincome);

	}

	static void print(int[] arr) {
		System.out.println("Display begining");
		for (int i = 0; i < arr.length; i++)

			System.out.println("begining" + arr[i]);
		System.out.println("Display end");
	}

	static int[] reverse(int[] pincome) {
		int n = pincome.length, temp;

		for (int i = 0; i < n / 2; i++) {
			temp = pincome[i];
			pincome[i] = pincome[n - i - 1];

			pincome[n - i - 1] = temp;

		}
		return pincome;
	}

	static int minincome(int[] pincome) {
		int min_pincome = pincome[0];
		for (int i = pincome.length - 1; i >= 0; i--) {
			if (min_pincome > pincome[i])
				min_pincome = pincome[i];

		}
		return min_pincome;

	}

}
