package com.arrays;

public class Arrays {
	public static void main(String[] args) {
		int arr[] = { 4, 8, 3, 1, 5, 6, 7, 9, 2, 3, 6, 1, 2, 7, 8 };
		// copyOneArraytoAnother(arr);
		// printReverseTheArry(arr);
		// revrsethearray(arr);
		// evenElementInArray(arr);
		// evenIndexInArray(arr);
		// oddIndexInArray(arr);
		// largestAndSmallestElementInArray(arr);
//		bubleSortingAscendingOrder(arr);
//		System.out.println();
//		bubleSortingdescendingOrder(arr);
		// rotateGivenArray(arr);
		// rotateGivenArrayNnumber(arr, 4);
		// rotateArrayLeftSide(arr);
		printUniqueElementInArray(arr);
	}

	public static void printUniqueElementInArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (i != j && arr[i] == arr[j])
					count++;

			}
			if (count == 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static void rotateArrayLeftSide(int arr[]) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void rotateGivenArray(int arr[]) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void rotateGivenArrayNnumber(int arr[], int num) {
		for (int j = 1; j <= num; j++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void bubleSortingAscendingOrder(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Buble Sort array in ascending order ");
		for (int i : arr) {
			System.out.print(i + " ");

		}
	}

	public static void bubleSortingdescendingOrder(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Buble Sort array in descending order ");
		for (int i : arr) {
			System.out.print(i + " ");

		}
	}

	public static void largestAndSmallestElementInArray(int arr[]) {
		int largest = arr[0];
		int smalest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i])
				largest = arr[i];
			else
				smalest = arr[i];
		}
		System.out.println("Largest element in Array " + largest);
		System.out.println("Smallest element in Array " + smalest);
	}

	public static void oddIndexInArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static void evenIndexInArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static void evenElementInArray(int arr[]) {
		for (int i : arr) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}

	public static void revrsethearray(int arr[]) {
		int temp = 0;
		int size = arr.length;
		for (int i = 0; i < size / 2; i++) {
			temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void printReverseTheArry(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void copyOneArraytoAnother(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}
}
