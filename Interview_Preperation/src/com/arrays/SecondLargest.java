package com.arrays;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1, 35 };
		System.out.println(getSecondLargest1(arr));
		System.out.println(getSecondLargest2(arr));
		System.out.println(getSecondLargest3(arr));
	}

	private static int getSecondLargest3(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > firstLargest) {
				firstLargest = arr[i];
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	private static int getSecondLargest2(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < firstLargest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}

	private static int getSecondLargest1(int[] arr) {
//		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int n = arr.length;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[n - 1])
				return arr[i];
		}
		return -1;
	}
}
