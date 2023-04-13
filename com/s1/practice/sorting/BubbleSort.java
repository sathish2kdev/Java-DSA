package com.s1.practice.sorting;

public class BubbleSort {

	void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	void sort1(int[] arr) {
		boolean status = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					status =true;
				}
			}
			if(!status)
				break;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
	//	int[] arr = {5,7,2,6,1}; 
//		int[] arr = {1,2,5,6,7}; 
		int arr[] ={3,60,35,2,45,320,5};  
//		bs.sort(arr);
		bs.sort1(arr);
	}
}
