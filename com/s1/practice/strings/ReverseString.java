package com.s1.practice.strings;




public class ReverseString {

	void reverse(String data) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=data.length()-1;i>=0;i--) {
			sb.append(data.charAt(i));
		}
		System.out.println(sb.toString());
	}
	
	void withoutStringBuffer(String data) {
		char[] a = new char[data.length()];
		for(int i=0;i<data.length();i++) {
			a[i] = data.charAt(data.length()-1-i);
		}
		String s1 = new String(a);
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		ReverseString st = new ReverseString();
		st.reverse("I am Going To Market.");
		st.withoutStringBuffer("sathish");
	}
}
