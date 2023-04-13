package com.s1.practice.basic;


public class SwapTwoNumbers {

	void swap(int a,int b) {
		int x=a;
		a=b;
		b=x;
		System.out.println("A => "+a);
		System.out.println("B => "+b);
	}
	
	void swapWithoutThird(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A => "+a);
		System.out.println("B => "+b);
	}
	
	public static void main(String[] args) {
		SwapTwoNumbers swap = new SwapTwoNumbers();
		swap.swap(2, 4);
		swap.swapWithoutThird(10, 24);
	}
}
