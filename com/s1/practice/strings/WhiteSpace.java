package com.s1.practice.strings;

public class WhiteSpace {

	public static void main(String[] args) {
	    String str1="Remove white spaces";   
	    String replacec = str1.replaceAll("\\s+","");
	    System.out.println(replacec);
	}
}
