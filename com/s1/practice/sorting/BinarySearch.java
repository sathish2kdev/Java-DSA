package com.s1.practice.sorting;

public class BinarySearch {

	void binarySerch(int[] arr, int key, int first, int last) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key)
				first = mid + 1;
			else if (arr[mid] == key) {
				System.out.println("Element Fount in array => " + mid);
				break;
			}

			else if (arr[mid] > key)
				last = mid - 1;
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
//		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int arr[] ={3,60,35,2,45,320,5};  
		int last = arr.length - 1;
		int key = 70;
		bs.binarySerch(arr, key, 0, last);
	}

	/*
	 * void binarySearch(int arr[], int first, int last, int key) { int arr[] =
	 * {10,20,30,40,50}; int key = 20; int last=arr.length-1;
	 * bs.binarySearch(arr,0,last,key); int mid = (first + last)/2; while( first <=
	 * last ){ if ( arr[mid] < key ){ first = mid + 1; }else if ( arr[mid] == key ){
	 * System.out.println("Element is found at index: " + mid); break; }else{ last =
	 * mid - 1; } mid = (first + last)/2; } if ( first > last ){
	 * System.out.println("Element is not found!"); } }
	 */}
