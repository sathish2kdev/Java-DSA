package com.s1.practice.strings;

public class Palindrome {

	void checkPalindromeOrNot(String data) {
		String str = "";
		for(int i=data.length()-1;i>=0;i--) {
			str +=data.charAt(i);
		}
		System.out.println(str);
		if(data.equals(str))
			System.out.println("Given String is palindrome");
		else
			System.out.println("Given String is not palindrome");
	}
	
	void checkPalindromeOrNotForValue(int data) {
		int revValue = 0;
		int actualValue = data;
		while(data>0) {
			int mod = data%10;
			revValue = revValue *10 +mod;
			data /= 10;
		}
		if(actualValue == revValue)
			System.out.println("Given value is palindrome");
		else
			System.out.println("Given value is not palindrome");
	}
	
	public static void main(String[] args) {
		Palindrome p1 = new Palindrome();
		p1.checkPalindromeOrNot("madam");
		p1.checkPalindromeOrNotForValue(121);
	}
}
