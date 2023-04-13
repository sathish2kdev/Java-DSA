package com.s1.practice.strings;

public class Class1 {

	void calculateLengthOfCharcter(String data) {
		int length = 0;
		for(int i=0;i<data.length();i++) {
			System.out.println(data.charAt(i));
			if(data.charAt(i) != ' ') {
				length++;
			}
		}
		System.out.println(length);
	}
	
	void puncutaion() {
		String str ="He said, 'The mailman loves you.' I heard it with my own ears.";
		int length = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')  {
				length++;
			}
		}
		System.out.println(length);
	}
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.calculateLengthOfCharcter("The best of both worlds");
		c1.puncutaion();
	}
}
