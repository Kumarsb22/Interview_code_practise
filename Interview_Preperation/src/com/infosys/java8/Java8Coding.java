package com.infosys.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Java8Coding {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 9, 1, 2, 3, 4, 5, 6, 7, 8);

		list.sort((a, b) -> a.compareTo(b));
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}

		System.out.println();
		Collections.sort(list, (a, b) -> a.compareTo(b));
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}

		System.out.println();

		list.sort(Integer::compareTo);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		List<Integer> list2 = list.stream().sorted().toList();
		for (Integer integer : list2) {
			System.out.print(integer + " ");
		}

		System.out.println();
		list.stream().sorted(Comparator.comparing(i -> i));

		System.out.println();

		TreeSet<Integer> a = new TreeSet<>(list);
		System.out.println(a.last());
		System.out.println(a.first());

		// find max 1St Approach
		// Optional<Integer> max2 = list.stream().max(Comparator.comparing(s -> s));
		Optional<Integer> max2 = list.stream().max(Integer::compareTo);
		System.out.println(max2.get());

		// find max 2nd Approach
		Optional<Integer> reduce = list.stream().reduce((a1, b) -> a1 > b ? a1 : b);
		System.out.println(reduce.get());

		// find max 3rd Approach
		int orElseThrow = list.stream().mapToInt(i -> i).max().orElseThrow();
		System.out.println(orElseThrow);

		// find max 4th Approach
		Optional<Integer> collect9 = list.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i)));
		System.out.println(collect9.get());

		// find min in list 1st approch
		Optional<Integer> min = list.stream().min(Integer::compareTo);
		System.out.println(min.get());

		// find min in list 2nd approach
		Optional<Integer> reduce2 = list.stream().reduce((a2, b) -> a2 < b ? a2 : b);
		System.out.println(reduce2.get());

		// find min in list 3rd approach
		int orElseThrow2 = list.stream().mapToInt(i -> i).min().orElseThrow();
		System.out.println(orElseThrow2);

		// find min in list 4th apprach
		Optional<Integer> collect10 = list.stream().collect(Collectors.minBy(Integer::compareTo));
		System.out.println(collect10.get());

		// find average in list 1st approach
		OptionalDouble average = list.stream().mapToInt(i -> i).average();
		System.out.println(average.getAsDouble());

		// find average in list 2nd approach
		Double collect11 = list.stream().collect(Collectors.averagingInt(i -> i));
		System.out.println(collect11);

		Integer reduce3 = list.stream().reduce(0, Integer::sum);
		long count = list.stream().count();
		Double average3 = count == 0 ? 0 : (double) reduce3 / count;
		System.out.println(average3);

		// find sum of list 1st apporach
		int sum2 = list.stream().mapToInt(i -> i).sum();
		System.out.println(sum2);

		// find sum of list 2nd approch
		Integer reduce4 = list.stream().reduce(0, (i, b) -> i + b);
		System.out.println(reduce4);

		// find sum of list 3rd apporach
		Integer collect12 = list.stream().collect(Collectors.summingInt(i -> i));
		System.out.println(collect12);

		// find sum of list 4th approach
		IntSummaryStatistics summaryStatistics = list.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println(summaryStatistics.getSum());
		System.out.println(summaryStatistics.getCount());

		// sum of even numbers in the list
		int sum = list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::valueOf).sum();
		System.out.println("Sum of the even numbers is " + sum);

		// write java program program to find the dublicate element in the list
		List<Integer> asList = Arrays.asList(1, 2, 3, 2, 4, 5, 5, 6);

		Set<Integer> collect = asList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println("Dublicate Elements available in the Given list " + collect);
		// unic element
		asList.stream().distinct();

		// write a java 8 program to sort a list of Strings based on their length
		List<String> asList2 = Arrays.asList("Java", "Spring", "Hibernate", "Jpa");

		asList2.sort(Comparator.comparingInt(String::length));
		System.out.println(asList2);
		// sort array ascending order
		asList2.stream().sorted();

		String collect2 = asList2.stream().collect(Collectors.joining(","));
		System.out.println(collect2);

		// write java program to count each character in a string
		String input = "infosys";
		Map<Character, Long> collect3 = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect3);

		// null pointer exception using Optional class
		String value = "Hello infosys";

		Optional<String> ofNullable = Optional.ofNullable(value);
		ofNullable.ifPresent(System.out::println);

		// write a program using jav 8 to reverse each word in a string
		String sentence = "Java Infosys";
		String collect4 = Arrays.stream(sentence.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.println(collect4);

		List<List<String>> names = Arrays.asList(Arrays.asList("Kumar"), Arrays.asList("Balambeed"));
		names.stream().flatMap(List::stream).forEach(System.out::println);

		// find the first non-repeated character in a string
		String in = "swiss";
		Character orElse = in.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(orElse);

		// remove the null values from a list
		List<String> asList3 = Arrays.asList("Kumar", null, "Hello");
		asList3.stream().filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);

		// find a maximum element in a list
		Optional<Integer> max = list.stream().max(Comparator.comparing(s -> s));
		// or
		Integer integer = list.stream().max(Integer::compareTo).orElseThrow();
		System.out.println(integer);
		System.out.println(max.get());

		// Group the Strings by their lengths
		List<String> asList4 = Arrays.asList("Kumar", "Balambeed", "java", "Developer", "Pava", "mava");
		Map<Integer, List<String>> collect5 = asList4.stream().collect(Collectors.groupingBy(l -> l.length()));
		System.out.println(collect5);

		Long collect6 = Arrays.stream(sentence.split(" ")).count();
		// collect(Collectors.counting());
		System.out.println(collect6);

		// check if all numbers are even using allMatch
		boolean allMatch = list.stream().allMatch(i -> i % 2 == 0);
		System.out.println(allMatch);

		// convert list map with string lengths
		Map<String, Long> collect7 = asList2.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		Map<String, Integer> collect8 = asList2.stream().collect(Collectors.toMap(c -> c, String::length));
		System.out.println(collect8);
	}
}
