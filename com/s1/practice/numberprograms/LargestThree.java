package com.s1.practice.numberprograms;

import java.util.Scanner;

public class LargestThree {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		int largest = (a>b&&a>c)?a:(b>c)?b:c;
		int smallest = (a<b&&a<c)?a:(b<c)?b:c;
//		if(a>b && a> c) {
//			largest = a;
//		}else
//			largest = (b>c)?b:c;
		System.out.println(largest);
		System.out.println(smallest);
		
		
	}
}
