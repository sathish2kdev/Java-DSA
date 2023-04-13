package com.s1.practice.basic;

public class ArmStrong {

	void givenNumberIsAmstrongOrNot(int data) {
		String len = String.valueOf(data);
		int pow = len.length();
		int orginalvalue = data;
		int addedValue =0;
		while(data>0) {
			int lastDigit = data%10;
//			addedValue += (lastDigit*lastDigit*lastDigit);
			addedValue += Math.pow(lastDigit, pow);
			data /= 10;
		}
		if(addedValue == orginalvalue)
			System.out.println("the Given Number Is Amstrong => "+addedValue);
//		else
//			System.out.println("the Given Number Is Not Amstrong => "+addedValue);
	}
	
	void findAmstrongWithLimit(int data) {
		for(int i=0;i<data;i++) {
			givenNumberIsAmstrongOrNot(i);
		}
	}
	
	public static void main(String[] args) {
		ArmStrong as = new ArmStrong();
		//as.givenNumberIsAmstrongOrNot(154);
		as.findAmstrongWithLimit(999);
	}
}
