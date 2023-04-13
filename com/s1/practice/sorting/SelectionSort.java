package com.s1.practice.sorting;

public class SelectionSort implements Cloneable {

	int[] arr1 = null;
	String data;
	void select(int[] arr) {
		System.out.println(data);
		for(int i=0;i<arr.length;i++) {
			int pos = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[pos] > arr[j]) {
					pos = j;
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i]= temp;
		}
		arr1 = arr;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SelectionSort ss = new SelectionSort();
		
		 int[] arr1 = {9,14,3,2,43,11,58,22};  
		 ss.select(arr1);
		 SelectionSort ss1= (SelectionSort)ss.clone();
	}
}
