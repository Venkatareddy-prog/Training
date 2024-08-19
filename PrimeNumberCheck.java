package com.examples;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		checkNumberIsPrime(1);

	}

	static void checkNumberIsPrime(int a) {
		boolean isPrime = true;
		if (a == 1)
			System.out.println("Given Number :" + " " + a + " " + "is not a Prime Number");
		else {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					System.out.println("Given Number :" + " " + a + " " + "is not a Prime Number");
					isPrime = false;
					break;

				}

			}
			if (isPrime) {

				System.out.println("Given Number :" + " " + a + " " + "is a Prime Number");
			}
		}

	}
}
