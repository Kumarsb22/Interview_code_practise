package com.rcursion;

public class Recursion {
	static int n = 5;

	public static void main(String[] args) {
//		printNaturalNumber(1);
//		System.out.println();
//		printNaturalNumberRevrse(10);

		// printEvenNumber(10 );
		//printfactorial();

		int sumOfNattuals = sumOfNattuals(1);
		System.out.println(sumOfNattuals);
	}

	public static int sumOfNattuals(int x) {
		if (x >10) 
			return 0;
			
			return x+sumOfNattuals(x + 1);
		

	}

	public static int printfactorial() {
		int n = 4;
		if (n == 1) {
			return 1;
		}
		return n-- * printfactorial();
	}

	public static void printOddNumber(int n) {
		if (n <= 10) {
			if (n % 2 != 0)
				System.out.print(n + " ");
			printNaturalNumber(n + 1);

		}
	}

	public static void printEvenNumber(int n) {
		if (n <= 10) {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
			printNaturalNumber(n + 1);
		}
	}

	public static void printNaturalNumber(int n) {
		if (n <= 10) {
			System.out.print(n + " ");
			printNaturalNumber(n + 1);
		}
	}

	public static void printNaturalNumberRevrse(int n) {
		if (n >= 1) {
			System.out.print(n + " ");
			printNaturalNumber(n - 1);
		}
	}
}
