package stringexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ECHALAN09
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		// 1) write program to reverse string without using the built in functions

		// first approach by using stringbuffer
		String s = "Java Developer";
		StringBuffer buffer = new StringBuffer();
		buffer.append(s);
		System.out.println("BY useing Strinbuffer : " + buffer.reverse());
		// second approach by using StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		System.out.println("By using Stringbuilder :" + builder.reverse());

		// without using the built in function
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Without using built function :" + reverse);

		char[] charArray = s.toCharArray();
		List<Character> characters = new ArrayList<>();
		for (int i = 0; i <= charArray.length - 1; i++) {
			characters.add(charArray[i]);
		}
		Collections.reverse(characters);

		StringBuilder reverseString = new StringBuilder();
		for (Character c : characters) {
			reverseString.append(c);
		}
		System.out.println("By using the collection reverse function : " + reverseString);

		// 2) write program to reverse the String without using the string built
		// functions
		char[] array = s.toCharArray();
		System.out.println("Without using the string builtin function");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}

		// 2) write a java program to swap the two numbers using the third variable

		int a = 22;
		int b = 33;
		int c;
		System.out.println("befor swapping the values a :" + a + "b : " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("ofter swapping the values a :" + a + "b : " + b);

		// 2) write a java program to swap the two numbers without using the third
		// variable

		a += b;
		b = a - b;
		a = a - b;
		System.out.println("without using the third variable swapping the values a :" + a + "b : " + b);

		// 4) write java program to count the number of words present in the string by
		// using the hashmap

		String count = "java";
		System.out.println(count.length());

		StringBuilder builder2 = new StringBuilder();
		builder2.append(count);
		System.out.println(builder2.length());

		int count2 = 0;
		for (int i = 0; i <= count.length() - 1; i++) {
			count2++;
		}
		System.out.println(count2);

		String words = "I love java programing language I love java programing language i love java Programing language";

		String[] split = words.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String string : split) {
			if (map.containsKey(string)) {
				int cc = map.get(string) + 1;
				map.put(string, cc);
			} else {
				map.put(string, 1);
			}

		}
		System.out.println("Counting the words present in the sentence by using the hasmap : " + map);

		// count the words without using the inbuilt function

		// 5)write program to print the whether string or number palindrom or not.

		String s2, revers = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number or String to check the give data is palindrom or not");
//		s2 = scanner.next();
		s2 = "javavaj";
		for (int i = s2.length() - 1; i >= 0; i--) {
			revers = revers + s2.charAt(i);
		}
		if (s2.equals(revers)) {
			System.out.println(s2 + " is the palindrom : " + revers);
		} else {
			System.out.println(s2 + " is not the palindrom : " + revers);
		}

		// 6) write program to check the given number is the prime number or not
		int num = 6;
		int counts = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				counts++;
			}
		}

		if (counts == 1) {
			System.out.println(num + " Given numvber is the prime number ");

		} else {
			System.out.println(num + " Given numvber is not the prime number ");
		}
		int n = 100;
		int isPrime = 0;
		// print 1 to 100 prime number
		for (int i = 1; i <= n; i++) {
			isPrime = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime++;
				}
			}
			if (isPrime == 0) {
				System.out.print(i + " ");

			}

		}

		// 7) write the java program for the fibonaccei series
		System.out.println();
		System.out.println("Fibonnaci series");
		int m = 0;
		int v = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.print(m + " ");
			int g = m + v;
			m = v;
			v = g;
		}
		// 8) write java program to print the dublicate available in the given string
		System.out.println();
		String dublicate = "Sentenace";
		char[] charArray2 = dublicate.toCharArray();
		for (int i = 0; i <= dublicate.length() - 1; i++) {
			for (int j = i + 1; j <= dublicate.length() - 1; j++) {
				if (charArray2[i] == charArray2[j]) {
					System.out.println("The dublicate characters are :");
					System.out.println(charArray2[i]);
					break;
				}
			}
		}
		try {
			System.out.println("Hello");
			// System.exit(1);
		} catch (Exception e) {
		} finally {
			System.out.println("me finally");
		}
		// 10) write java program to check to check the amstrong number
		int amstrong = 153;
		int temp, p, sum = 0;
		temp = amstrong;
		while (amstrong > 0) {
			p = amstrong % 10;
			amstrong = amstrong / 10;
			sum = sum + (p * p * p);
		}
		if (temp == sum) {
			System.out.println("The given number is the amstrong number : " + sum);
		} else {
			System.out.println("The given number is not the amstrong number : " + sum);
		}

		// 11) write program to print the strong number
		if (isStrongNumber(145)) {
			System.out.println(145 + " is the strong number");
		} else {
			System.out.println(145 + " is not the strong number");
		}
	}

	public static boolean isStrongNumber(int n) {
		int sum = 0;
		int temp = n;
		while (n > 0) {
			int digit = n % 10;
			sum += factorial(digit);
			n /= 10;
		}
		return sum == temp;

	}

	public static int factorial(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return fact;

	}

}
