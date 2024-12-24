package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8stream {
	public static void main(String[] args) {
		// java 8 stream
		// sum of numbers
		List<Integer> asList = Arrays.asList(-22, +23, 4, 6, 5, 7, 55, 56, 77, 222, 243, 211, 278, 267, 4, 5, 6);
		Optional<Integer> reduce = asList.stream().reduce((a, b) -> a + b);
		System.out.println("Sum of all above numbers :" + reduce.get());

		// print the average of all the numbers
		// we cont use average directly on the stream after map we can use
		double asDouble = asList.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println("Average of the all number is : " + asDouble);

		// square filter and average of Numbers
		double avarage = asList.stream().map(e -> e * e).mapToInt(e -> e).filter(e -> e > 100).average().getAsDouble();
		System.out.println("Squre , filter and average is: " + avarage);

		// findout the odd and even nuber present in the array
		List<Integer> even = asList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Number is : " + even);

		List<Integer> odd = asList.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println("Even Number is : " + odd);

		// print Numbers starts with prefix 2 using
		List<Integer> numstw2 = asList.stream().map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("2") || e.startsWith("-2") || e.startsWith("+2")).map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println("The number starting with 2 is : " + numstw2);

		// print dublicate number in list
		Set<Integer> dublicate = asList.stream().filter(e -> Collections.frequency(asList, e) > 1)
				.collect(Collectors.toSet());
		System.out.println("The Dublicate : " + dublicate);

		Set<Integer> dupNum = new HashSet<>();
		Set<Integer> collect = asList.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
		System.out.println("Dublicate numbers present in the array : " + collect);

		// Max and min number present in the array
		Integer max = asList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The max number is : " + max);

		Integer min = asList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min number present in the given array : " + min);

		// sort the numbers asc/desc using sreams
		List<Integer> asc = asList.stream().sorted().collect(Collectors.toList());
		System.out.println("Printing the list in ascending order : " + asc);

		List<Integer> desc = asList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Printing the list in desending order : " + desc);

		// get first 5 numbers --.sum of 5 numbers

		List<Integer> f5 = asList.stream().limit(5).collect(Collectors.toList());
		System.out.println("Get the first 5 numbers : " + f5);

		Optional<Integer> sum = asList.stream().limit(5).reduce((a, b) -> a + b);
		System.out.println("The sum of the first 5 numbers : " + sum.get());

		// skip the first 5 numbers
		List<Integer> collect2 = asList.stream().skip(5).collect(Collectors.toList());
		System.out.println("Skip the first five numbers : " + collect2);

		Integer skip = asList.stream().skip(5).reduce((a, b) -> a + b).get();
		System.out.println("Skip the first five numbers and sum : " + skip);

		// get the second hiest and second lowest number present in the array

		Integer senH = asList.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second hiest value is : " + senH);

		Integer secL = asList.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second Lowest value or number is : " + secL);
	}
}
