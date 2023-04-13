package com.s1.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

	void subSet(String data) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<=data.length();j++) {
				list.add(data.substring(i,j));
			}
		}
		System.out.println(list);
	}
	
	void vovelsAndConstant(String data) {
//		char[] s1 = {'a','e','i','o','u'};
		Character[] s1 = {'a','e','i','o','u'};
		List<Character> vovels = Arrays.asList(s1);
		int vovel = 0;
		int constant = 0;
		for(int i=0;i<data.length();i++) {
			if(vovels.contains(data.charAt(i))) 
				vovel++;
			else
				constant++;
		}
		System.out.println(vovel);
		System.out.println(constant);
	}
	
	public static void main(String[] args) {
		Subset s = new Subset();
		s.subSet("sathish");
		s.vovelsAndConstant("This is a really simple sentence");
	}
}
