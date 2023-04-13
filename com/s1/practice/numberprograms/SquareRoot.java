package com.s1.practice.numberprograms;

public class SquareRoot {

	double square(int num) {
		double t;
		double sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		return sqrtroot;

	}

	double sqrt(int data) {
		double d;
		double d1 = data / 2;
		do {
			d = d1;
			d1 = (d + (data / d)) / 2;
		} while ((d - d1) != 0);
		return d1;
	}

	static boolean checkPerfectSquare(double number) {
		// calculating the square root of the given number
		double sqrt = Math.sqrt(number);
		System.out.println(Math.floor(sqrt));
		// finds the floor value of the square root and comparing it with zero
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

	public static void main(String[] args) {
		SquareRoot sq = new SquareRoot();
		System.out.println(sq.square(129));
		System.out.println(sq.sqrt(129));
		System.out.println(sq.checkPerfectSquare(8110));
	}

}
