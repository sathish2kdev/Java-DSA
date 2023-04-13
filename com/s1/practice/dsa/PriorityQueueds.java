package com.s1.practice.dsa;

import java.util.ArrayList;

public class PriorityQueueds {

	ArrayList<Integer> list;
	PriorityQueueds(){
		list = new ArrayList<>();
	}
	 
	void maxHeapify(int i) {
		int size = list.size();
		int largest = i;
		int ln = 2*i+1;
		int rn = 2*i+2;
		if(ln<size && list.get(ln) > list.get(largest))
			largest = ln;
		if(rn<size && list.get(rn) > list.get(largest))
			largest = rn;
		
		if(largest != i) {
			int swap = list.get(largest);
			list.set(largest, list.get(i));
			list.set(i, swap);
			maxHeapify(i);
		}
		
	}
	
	void insertQeueu(int data) {
		if(list.size() == 0)
			list.add(data);
		else {
			list.add(data);
			int size = list.size();
			for(int i=(size/2)-1;i>=0;i--) {
				maxHeapify(i);
			}
		}
	}
	
	void delete(int ele) {
		int i = -1;
		for(int x=0;x<list.size();x++) {
			if(ele == list.get(x))
				i = x;
		}
		int size = list.size();
		list.set(i, list.get(size-1));
		list.remove(size-1);
		
		for(int x=(size/2)-1;x>=0;x--) {
			maxHeapify(x);
		}
		
	}
	
	public static void main(String[] args) {
		PriorityQueueds ps = new PriorityQueueds();
		ps.insertQeueu(3);
		ps.insertQeueu(9);
		ps.insertQeueu(2);
		ps.insertQeueu(1);
		ps.insertQeueu(4);
		ps.insertQeueu(5);
		ps.list.forEach(p -> System.out.print(p+","));
		ps.delete(4);
		System.out.println("Deleteing Priority Queue Element");
		ps.list.forEach(p -> System.out.print(p+","));
	}
}
