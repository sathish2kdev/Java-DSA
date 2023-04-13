package com.s1.practice.basic;

public class Fibonacci {

	void withOutRecusrion(int count) {
		int i=0,j=1,z=0;
		int data=0;
		while(data<count) {
			System.out.print(i+",");
			z = i+j;
			i=j;
			j=z;
			data++;
		}
	}
	
	void withRecursion(int count,int prev,int curr,int stop) {
		while(stop<count) {
			System.out.print(prev+",");
			int data1 = curr;
			curr += prev;
			prev = data1;
			stop++;
			withRecursion(count, prev, curr,stop);
			break;
		}
	}
	
	static int n1=0,n2=1,n3 =0;
	void withRecusrion(int count) {
		if(count > 0) {
			System.out.print(n1+",");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count--;
			withRecusrion(count);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f1 = new Fibonacci();
		f1.withOutRecusrion(10);
		System.out.println("with Recusrion => ");
//		f1.withRecursion(10, 0, 1,0);
		f1.withRecusrion(10);
	}
}
