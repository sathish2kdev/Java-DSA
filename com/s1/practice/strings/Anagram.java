package com.s1.practice.strings;

import java.util.Arrays;

public class Anagram {

	void findAnagarm(String s1,String s2) {
		if(s1.length() == s2.length()) {
			String l1 = s1.toLowerCase();
			String l2 = s2.toLowerCase();
			char[] c1 = l1.toCharArray();
			char[] c2 = l2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("The Number Is Anagarm");
			}else
				System.out.println("The Number Is Not Anagarm");	
		}
	}
	
	
	public static void main(String[] args) {
		Anagram an = new Anagram();
		an.findAnagarm("Brag", "Grab");
	}
}
