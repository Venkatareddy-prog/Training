package com.examples;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArryEg {

	public static void main(String[] args) {

		int[] array = { 123, 31, 42, 3, 65, 89 };

		boolean ascn = true;

		sort(array, ascn);
		System.out.println("Sorted array: " + Arrays.toString(array));
		sort(array, !ascn);

		System.out.println("Reversed array: " + Arrays.toString(array));

	}

	public static void sort(int[] arr, boolean ascn) {
		if (ascn) {
			Arrays.sort(arr);
		} else {
			Arrays.sort(arr);
			reverse(arr);
		}
	}

	public static void reverse(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}
	}
}
