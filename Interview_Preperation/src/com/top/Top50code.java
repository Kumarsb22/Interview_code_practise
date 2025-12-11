package com.top;

import java.util.Arrays;

import java.util.Collections;
import java.util.stream.Collectors;

public class Top50code {
	public static void main(String[] args) {

		String msg = "Hello Welcome to National Informatics Center Kolkata";
		// System.out.println(reverseWord(msg));

		// System.out.println(reverseStringCustom("Kumar"));
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
		int element = 5;
		sumOfElementsEqualtoGivenElement(element, arr);
		;
	}

	public static void sumOfElementsEqualtoGivenElement(int element, int arr[]) {
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i] + arr[i + 1] == element) {
				System.out.println(arr[i] + " ," + arr[i + 1] + " =" + element);
				System.out.println(arr[i + i] + " ," + arr[i] + " =" + element);
			}
		}
	}

	public static String reverseWord(String msg) {
		String[] split = msg.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String word : split) {
			StringBuilder stringBuilder = new StringBuilder(word);
			builder.append(stringBuilder.reverse()).append(" ");
		}
		return builder.toString().trim();
	}

	public static String revereString(String word) {
		return new StringBuilder(word).reverse().toString();
	}

	public static String reverseStringCustom(String word) {
		char[] charArray = word.toCharArray();
		StringBuilder builder = new StringBuilder();

//		for (int i = word.length() - 1; i >= 0; i--) {
//			builder.append(word.charAt(i));
//		}
		for (int i = charArray.length - 1; i >= 0; i--) {
			builder.append(charArray[i]);
		}
		return builder.toString();
	}

	public static String reverseStringSream(String word) {
//		return new StringBuilder(word.chars().
//				mapToObj(c->(char)c)
//				.collect(Collectors.toList())
//				).reverse().toString();

		return null;

	}
}
