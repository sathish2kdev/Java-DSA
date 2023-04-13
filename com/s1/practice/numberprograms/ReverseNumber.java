package com.s1.practice.numberprograms;

public class ReverseNumber {

	int reverseData(int num) {
		int revNumber = 0;
		while (num > 0) {
			int mod = num % 10;
			revNumber = (revNumber * 10) + mod;
			num /= 10;
		}
		return revNumber;
	}
	
	int reverseNegative(int num) {
		boolean status = num>0?true:false;
		if(!status)
			num *= -1;
		int revNumber = 0;
		while (num > 0) {
			int mod = num % 10;
			revNumber = (revNumber * 10) + mod;
			num /= 10;
		}
		return status?revNumber:revNumber*-1;
		
	}

	public static void reverseNumber(int number) {
		if (number < 10) {
			// prints the same number if the number is less than 10
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reverseNumber(number / 10);
		}
	}

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		System.out.println(rn.reverseData(-98765));
		rn.reverseNumber(234);
		System.out.println(rn.reverseNegative(-98765));

	}

}
