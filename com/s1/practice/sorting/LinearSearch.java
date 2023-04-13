package com.s1.practice.sorting;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;
		int x = -1;
		for(int i=0;i<a1.length;i++) {
			if(a1[i] == key) {
				x=i;
				break;
			}
		}
		System.out.println((1/2));
		System.out.println("index of element => "+x);
	}
}
