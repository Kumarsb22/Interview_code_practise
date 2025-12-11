package com.infosys.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8PracticeLinkdin {
	public static void main(String[] args) {
		// 1) find the longest string from the arrays of string
		String[] fruits = { "apple", "banana", "straberry", "kiwi", "pinaple" };
		Optional<String> longestString = Arrays.stream(fruits).min(Comparator.comparing(String::length));
		System.out.println("The longest Strings in arrays:=> " + longestString);

		// 2)filter even number from the list
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		num.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		// 3)first non repeated char from the given string
		String input = "swiss";
		System.out.println(findNonRepeatedCharInString(input).get());

	}

	public static Optional<Character> findNonRepeatedCharInString(String input) {
		if (input.isBlank() || input.isEmpty())
			return null;
		LinkedHashMap<Character, Integer> countChar = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			countChar.put(c, countChar.getOrDefault(c, 0) + 1);
		}
		return countChar.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();
	}
}
