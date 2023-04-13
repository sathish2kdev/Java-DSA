package com.s1.practice.basic;

public class HeapCheck {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();

		// displaying max memory of heap in bytes
//		System.out.println("Max memory" + " " + r.maxMemory());
//
//		// displaying initial memory in bytes
//		System.out.println("Initial memory" + " " + r.totalMemory());
//
//		// displaying free memory in bytes
//		System.out.println("Free memory" + " " + r.freeMemory());
//
//		// displaying consume memory in bytes
//		System.out.println("Consume memory" + " " + (r.totalMemory() - r.freeMemory()));

		///
		double mb = 1000000;

		// displaying max memory of heap in Mb
		System.out.println("Max memory" + " " + r.maxMemory() / mb);

		// displaying initial memory in Mb
		System.out.println("Initial memory" + " " + r.totalMemory() / mb);

		// displaying free memory in Mb
		System.out.println("Free memory" + " " + r.freeMemory() / mb);

		// displaying consume memory in Mb
		System.out.println("Consume memory" + " " + (r.totalMemory() - r.freeMemory()) / mb);
	}
}
