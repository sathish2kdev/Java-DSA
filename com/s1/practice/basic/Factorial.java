package com.s1.practice.basic;

public class Factorial {

	void Factorial(int data) {
		int count=1;
//		for(int i=data;i>0;i--) {
//			count*=i;
//		}
		while(data != 0) {
			count *= data;
			data--;
		}
		System.out.println(count);
	}
	static int count = 1;
//	void factorialRecusrion(int data) {
//		while(data!=0) {
//			count *=data;
//			data--;
//			factorialRecusrion(data);
//			break;
//		}
//		System.out.println(count);
//	}
	
	int factorialRecusrion(int data) {
		if(data ==0)
			return 1;
		else
			return (data * factorialRecusrion(data-1));
	}
	
	public static void main(String[] args) {
		Factorial f1 = new Factorial();
		//f1.Factorial(5);
		System.out.println(f1.factorialRecusrion(5));
		f1.factorialRecusrion(5);
	}
}
