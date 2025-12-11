package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class ThirdLargest {
	public static void main(String[] args) {
//		int[] arr = { 12, 35, 1, 10, 36, 36, 1, 39 };
//		frequencyInArray(arr);
//		System.out.println(getThirdLargest1(arr));
//		System.out.println(getThirdLargest2(arr));
//		System.out.println(getThirdLargest3(arr));
//		int removeDublicateElement = printDublicateElement(arr);
//		for (int i = 0; i < removeDublicateElement; i++) {
//			System.out.println(arr[i]);
//		}
		// System.out.println(removeDublicateElementPredifined(arr));
		int[] arr1 = { 0,0,0,1, 2, 4, 5, 6, 7, 3,0 };
		for (int i : revrseArray(arr1, 0, arr1.length - 1)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : resizeAray(arr1, (arr1.length * 3) / 2)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : moveZeroToEnd(arr1)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : moveZeroToFirst(arr1)) {
			System.out.print(i + " ");
		}
		System.out.println();
//		
//		for (int[] i : sumOfThreeElement(arr1, 9)) {
//			System.out.println(i[0] + " + " + i[1] + " + " + i[2] + " = " + 9);
//		}
//		System.out.println(missingNumberInArray(arr1));
	}

	public static int[] resizeAray(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}

	public static int[] moveZeroToEnd(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
		return arr;
	}

	public static int[] moveZeroToFirst(int arr[]) {
		int j = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j--;
			}
		}
		return arr;
	}

	public static int[] revrseArray(int arr[], int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static List<int[]> sumOfTwoElement(int arr[], int target) {
		List<int[]> is = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == target)
					is.add(new int[] { arr[i], arr[j] });
			}
		}

		return is;
	}

	public static List<int[]> sumOfThreeElement(int[] arr, int target) {
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						list.add(new int[] { arr[i], arr[j], arr[k] });
					}
				}
			}
		}
		return list;
	}

	public static void frequencyInArray(int arr[]) {

		boolean visited[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println("Element " + arr[i] + " Occurance or Frequanc " + count);
		}
	}

	public static int removeDublicateElement(int arr[]) {
		// Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int index = 0;
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				newArray[index++] = arr[i];

			}

		}
		newArray[index++] = arr[arr.length - 1];

		return index;

	}

	public static int missingNumberInArray(int arr[]) {
		int sum = 0;
		int n = arr.length + 1;
		for (int i : arr) {
			sum += i;
		}
		int actualSum = n * (n + 1) / 2;
		return actualSum - sum;
	}

	public static LinkedHashSet<Integer> removeDublicateElementPredifined(int arr[]) {
		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hashSet.add(arr[i]);

		}

		return hashSet;

	}

	private static int getThirdLargest3(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		int thirdLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > thirdLargest && arr[i] < secondLargest) {
				thirdLargest = arr[i];
			}
		}

		return thirdLargest;
	}

	private static int getThirdLargest2(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] > largest && arr[i] < thirdLargest) {
				thirdLargest = arr[i];
			}
//				thirdLargest = secondLargest;
//				secondLargest = arr[i];
//			} else if (arr[i] > thirdLargest) {
//				thirdLargest = arr[i];
//			}
		}
		return thirdLargest;
	}

	private static int getThirdLargest1(int[] arr) {

		// Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int count = 1;
		int thirdLargest = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != thirdLargest) {
				thirdLargest = arr[i];
				count++;
			}
			if (count == 3) {
				return thirdLargest;
			}
		}

		return -1;
	}
}
