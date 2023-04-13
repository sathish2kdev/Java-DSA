package com.s1.practice.linear;

public class Class1 {

	int linearSearch(int[] arr, int ele) {
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				pos = i;
			}
		}
		return pos;
	}

	int binarySearch(int[] arr, int ele) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (last + first) / 2;
		while (first <= last) {
			if (arr[mid] < ele) {
				first++;
			} else if (arr[mid] > ele) {
				last--;
			} else if (ele == arr[mid]) {
				return mid;
			}
			mid = (last + first) / 2;
		}
		return 0;
	}

	void bubbleSort(int[] arr) {
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int ele = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ele;
					status = true;
				}

			}
			if (!status)
				break;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int pos = i;

			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[pos] > arr[j]) {
					pos = j;
				}
			}

			int ele = arr[i];
			arr[i] = arr[pos];
			arr[pos] = ele;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;
		System.out.println("Linear Search index of element => " + c1.linearSearch(a1, key));
		System.out.println("Linear Search index of element => " + c1.binarySearch(a1, key));
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
//		c1.bubbleSort(arr);
		System.out.println("S");
		c1.selectionSort(arr);
	}
}
