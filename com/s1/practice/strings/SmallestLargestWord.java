package com.s1.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SmallestLargestWord {

	void findLargestAndSmallest(String data) {
		String[] dt1 = data.split(" ");
		List<String> list = Arrays.asList(dt1);
		int smallest = 0;
		int largest = -1;
		for(int x=0;x<list.size()-1;x++) {
			if(Integer.valueOf(list.get(x).length()) < Integer.valueOf(list.get(x+1).length()))
				largest = x+1;
			else
				largest = x;
			if(Integer.valueOf(list.get(x).length()) < Integer.valueOf(list.get(x+1).length()))
				smallest = (list.get(smallest).length()>list.get(x).length())?x:smallest;
			else
				smallest = (list.get(smallest).length()>list.get(x+1).length())?x+1:smallest;
				
		}
		System.out.println(list.get(smallest));
		System.out.println(list.get(largest));
	}
	
	
	void duplicateWords(String data) {
		String[] dt1 = data.split(" ");
		List<String> list = Arrays.asList(dt1);
		Set<String> dup = new LinkedHashSet<>();
		for(int x=0;x<list.size();x++) {
			for(int j=x+1;j<list.size()-1;j++) {
				//System.out.println(list.get(x) +"  "+list.get(j));
				if(list.get(x).equalsIgnoreCase(list.get(j)))
					dup.add(list.get(x).toLowerCase());
			}
			
		}
		dup.forEach(p -> System.out.println(p));
	}
	public static void main(String[] args) {
		SmallestLargestWord sl = new SmallestLargestWord();
		//sl.findLargestAndSmallest("Hardships often prepare ordinary people for an extraordinary destiny");
		sl.duplicateWords("Big black bug bit a big black dog on his big black nose");
	}
}
