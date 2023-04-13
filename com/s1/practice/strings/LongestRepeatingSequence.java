package com.s1.practice.strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestRepeatingSequence {

	void longRepetingSeq(String data) {
		List<String> string  = new ArrayList<>(); 
		for(int i=0;i<data.length();i++)
		{
			for(int j=i+1;j<data.length();j++) {
				string.add(data.substring(i,j));
			}
		}
		System.out.println(string);
		Set<String> repeatingChar = new LinkedHashSet(); 
		for (String string2 : string) {
			int i=0;
			for (String string3 : string) {
				if(string2.equals(string3)) {
					if(i>0)
						repeatingChar.add(string2);
					i++;
				}
			}
		}
		System.out.println(repeatingChar);
	}
	
	public static void main(String[] args) {
		LongestRepeatingSequence rs = new LongestRepeatingSequence();
		rs.longRepetingSeq("acbdfghybdf");
	}
}
