package com.s1.practice.numberprograms;

import java.util.ArrayList;
import java.util.List;

public class CommanFactor {

	void gcf(int a1, int a2) {
		List<Integer> l1 = factor(a1);
		List<Integer> l2 = factor(a2);
		List<Integer> cf = commonFactor(l1, l2);
		System.out.println("Common Factor => ");
		cf.forEach(p -> System.out.print(p+", "));
		int gcf = gcf(cf);
		System.out.println("Greatest Common Factor => "+gcf);
		
	}
	int gcf(List<Integer> l1) {
		return l1.get(l1.size()-1);
	}

	List<Integer> commonFactor(List<Integer> l1, List<Integer> l2) {
		int a = l1.size();
		int b = l2.size();
		if (a < b)
			return l1;
		else
			return l2;

	}

	List<Integer> factor(int data) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= data / 2; i++) {
			if (data % i == 0)
				list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {
		CommanFactor cf = new CommanFactor();
		cf.gcf(12,8);
	}

}
