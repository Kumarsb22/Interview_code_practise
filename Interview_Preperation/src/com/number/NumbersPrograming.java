package com.number;

public class NumbersPrograming {

	public static void main(String[] args) {

//		EvenNumberOrOdNumber(1);
//		EvenNumberOrOdNumber(2);
		// swapTwoNumbers(1, 2);
		// swapTwoNumbersWithoutThirdVariable(10, 20);
		// factorOfGivenNumber(20);
		// primeNumberOrNot(1000);
		// primeNumberUptoNNumber(100);
		// factorialOfNumber(4);
		// powerOFNumber(2, 6);
		// countTotalNumberOfDigit(70228599);
		// printFirstAndLastDigitInGivenNumber(70228599);
		// sumOfDigitNumber(123456);
		// numberIsPalidromOrNot(12321);
		// largestDigitInNumberAndSmallest(71228599);
		// givenNumberIsPerfectSquareOrNot(16);
//		boolean armstrong = isArmstrong(152);
//		System.out.println("Is number is armstrong " + armstrong);
		// fiboniseySeries(10);
		// isNumberStrong(145);
		numberToBinary(10);
		bintonumber(1010);
	}

	public static void numberToBinary(int num) {
		int bin = 0, temp = 1;
		while (num != 0) {
			bin = bin + (num % 2) * temp;
			temp *= 10;
			num /= 2;
		}
		System.out.println(bin);
	}

	public static void bintonumber(int bin) {
		int num = 0, temp = 1;
		while (bin != 0) {
			num += (bin % 10) * temp;
			temp *= 2;
			bin /= 10;
		}
		System.out.println(num);
	}

	public static void isNumberStrong(int num) {
		int m = num, sum = 0;
		while (num != 0) {
			int rem = num % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			num /= 10;
		}
		System.out.println(sum == m ? "Number is the Strong Number " : "Number is not Strong number");

	}

	public static void fiboniseySeries(int num) {
		int a = 0, b = 1, c;
		for (int i = 0; i <= num; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static boolean isArmstrong(int num) {
//		Problem: A number is an Armstrong number if the sum of the cubes of its digits equals the number itself 
//		(e.g., 153 = 1³ + 5³ + 3³).

		int m = num;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}
		return sum == m;
	}

	public static void givenNumberIsPerfectSquareOrNot(int num) {
		int sqrt = (int) Math.sqrt(num);
		System.out.println(num == (sqrt * sqrt) ? "Number is perfect square " : "Number is not a perfect square");

	}

	public static void largestDigitInNumberAndSmallest(int num) {
		int max = num % 10;
		int min = num % 10;
		while (num != 0) {
			int rem = num % 10;
			if (rem > max)
				max = rem;
			if (rem < min)
				min = rem;
			num = num / 10;
		}
		System.out.println("The largest Number is " + max + " And Smallest Number is " + min);
	}

	public static void numberIsPalidromOrNot(int num) {
		int m = num;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		System.out.println(rev);
		System.out.println(rev == m ? "The number is palindrome " : " Number is not palindrom");
	}

	public static void sumOfDigitNumber(int num) {
		int sum = 0, m = num;
		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println(m + " Sum of the Given  number is " + sum);
	}

	public static void printFirstAndLastDigitInGivenNumber(int num) {
		int lastNum = num % 10;
		int m = num;
		while (num > 10) {
			num = num / 10;

		}
		System.out.println(m + " first number is " + num + " Last number is " + lastNum);
	}

	public static void countTotalNumberOfDigit(int number) {
		int count = 0;
		int m = number;
		while (number != 0) {
			number /= 10;
			count++;
		}
		System.out.println(m + " The total count of the given number digit is " + count);
	}

	public static void powerOFNumber(int base, int pow) {
		int op = 1;
		while (pow-- >= 1) {
			op *= base;
		}
		System.out.println(op);
	}

	public static void factorialOfNumber(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println(num + " Factors of the number is " + fact);
	}

	public static void primeNumberUptoNNumber(int num) {

		for (int i = 1; i <= num; i++) {
			int count = 0;

			for (int j = 2; j <= i / 2; j++) {
				if (count > 0)
					break;
				if (i % j == 0)
					count++;

			}

			if (count == 0)
				System.out.println(" The Prime Numbers are " + i);
		}
	}

	public static void primeNumberOrNot(int num) {
		int count = 0;
		int loop = 0;
		for (int i = 2; i <= num / 2; i++) {
			loop++;
			if (count > 0)
				break;
			if (num % i == 0)
				count++;

		}
		System.out.println(loop);
		if (count == 0)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");
	}

	public static void factorOfGivenNumber(int num) {
		System.out.println(num + " Factor of the number is :");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(" " + i);
		}
	}

	public static void swapTwoNumbersWithoutThirdVariable(int a, int b) {
		System.out.println("Before number swap a ->" + a + "  b-> " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After number swap a ->" + a + "  b-> " + b);

	}

	public static void swapTwoNumbers(int a, int b) {
		System.out.println("Before number swap a ->" + a + "  b-> " + b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After number swap a ->" + a + "  b-> " + b);

	}

	public static void EvenNumberOrOdNumber(int num) {
		System.out.println((num % 2 == 0) ? "even number" : "odd number");
	}
}
