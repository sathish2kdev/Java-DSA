package com.s1.practice.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharcterSequence {

	void checkLenthOfCharcter(String d1) {
		String data= d1.toLowerCase();
		for(char a='a';a<='z';a++) {
			int count = 0;
			for(int i=0;i<data.length();i++) {
				if(data.charAt(i) == a)
					count++;
			}
			if(count > 0)
				System.out.println("character => "+a+" no of Occurence => "+count);
		}
	}
	
	void checkDuplicate(String data) {
		Set<Character> sb = new LinkedHashSet<>(); 
		for(int i=0;i<data.length();i++) {
			char a = data.charAt(i);
			for(int j=i+1;j<data.length()-1;j++) {
				if(a == data.charAt(j))
					sb.add(a);	
			}
		}
		System.out.println(sb);
	}
	
	void MinumumAndMaxmimumOccuringCharacter() {
		String data = "grass is greener on the other side";
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char a= 'a';a<='z';a++) {
			int count =0;
			for(int i=0;i<data.length();i++) {
				if(a == data.charAt(i))
					count++;
			}
			if(count > 0)
				map.put(a, count);
		}
		//char min = '';
		
		int min =1;
		int max= 1;
		String maxval = "";
		String minVal = "";
		for(Map.Entry<Character,Integer> map1:map.entrySet()) {
			if(map1.getValue()<=min) {
				min = map1.getValue();
				minVal = map1.getKey().toString();
			}
			if(map1.getValue()>max) {
				max = map1.getValue();
				maxval = map1.getKey().toString();
			}
				
			//System.out.println("key : "+map1.getKey()+", value"+map1.getValue());
		}
		System.out.println("Minimum occurring character "+minVal);
		System.out.println("Maximum occurring character "+maxval);
	}
	
	public static void main(String[] args) {
		CharcterSequence cs = new CharcterSequence();
		cs.checkLenthOfCharcter("picture perfect");
		cs.checkDuplicate("Great responsibility");
		cs.MinumumAndMaxmimumOccuringCharacter();
	}
}
