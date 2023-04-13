package com.s1.practice.strings;

public class SwapString {

	public static void main(String[] args) {
		  String str1 = "Good ", str2 = "morning ";   
		  int str1Len  = str1.length();
		  int str2Len  = str2.length();
		str1 = str1+str2;
		str2 = str1.substring(0,str1Len);
		str1 = str1.substring(str2.length());
		System.out.println("STR 1 => "+str1);
		System.out.println("STR 2 => "+str2);
	}
}
