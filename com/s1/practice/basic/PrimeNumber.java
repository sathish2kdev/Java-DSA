package com.s1.practice.basic;

public class PrimeNumber {

	void IsPrimeOrNotEvenOrOdd(int data) {
		boolean status = false;
		if (data % 2 == 0)
			status = true;
		if (status)
			System.out.println("The Given Number is Even Number => " + data);
		else
			System.out.println("The Given Number is Not Even Number => " + data);
	}

	void isPrimeOrNotWithNumber(int data) {
		if (data == 0 || data == 1)
			System.out.println("The Given Number is not Prime Number =>" + data);
		else {
			int count = 0;
			for (int i = 2; i < data; i++) {
				if (data % i == 0)
					count++;
			}
			if (count == 0)
				System.out.println("The Given Number is Prime Number =>" + data);
			else
				System.out.println("The Given Number is not Prime Number =>" + data);
		}

	}

	void isPrimeOrNotWithRange(int data) {
		if (data == 1)
			System.out.println("1 is Not Prime Number");
		else if (data == 2) {
			System.out.println("1 is Not Prime Number");
			System.out.println("2 is Prime Number");
		}

		else if (data > 2) {
			for (int i = 2; i <= data; i++) {
				int count = 0;
				for (int a = 2; a < i; a++) {
					if (i % a == 0)
						count++;
				}

				if (count == 0)
					System.out.println("The Given Number is Prime Number =>" + i);
				else
					System.out.println("The Given Number is not Prime Number =>" + i);
			}
		}
	}

	void betweenRangePrimeNumber(int start, int end) {
		for (int x = start; x <= end; x++) {
			int count = 0;
			for (int a = 2; a < x; a++) {
				if (x % a == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println("The Given Number is Prime Number =>" + x);
			else
				System.out.println("The Given Number is not Prime Number =>" + x);
		}
	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
//		pn.IsPrimeOrNotEvenOrOdd(4);
//		pn.isPrimeOrNotWithNumber(12);
//		pn.isPrimeOrNotWithRange(25);
		pn.betweenRangePrimeNumber(100,200);
	}

}
