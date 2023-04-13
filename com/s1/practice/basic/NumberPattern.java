package com.s1.practice.basic;

public class NumberPattern {

	void printNumber(int max) {
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void addNumber(int max) {
		int x = 1;
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}

	void thirdPattern(int max) {
		for (int i = 1; i < max+1; i++) {
			for(int y=max;y>1;y--) {
				if(y<=i)
					System.out.print(y);
				else
					System.out.print(" ");
			}
			for(int y=1;y<max+1;y++) {
				if(y<=i)
					System.out.print(y);
			}
			System.out.println();
		}
		for (int i = max; i > 0; i--) {
			for(int x=max;x>1;x--) {
				if(x>=i)
					System.out.print(" ");
				else
					System.out.print(x);
			}
			for(int x=1;x<=i;x++) {
				if(x<i)
					System.out.print(x);
			}
			System.out.println();
		}
	}
	
	void pattern(int max) {
		for(int i=1;i<=max;i++) {
			for(int x=i;x>0;x--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	void pattern1(int max) {
		for(int i=1;i<=max;i++) {
			for(int x=1;x<=i;x++) {
				System.out.print(x);
			}
			System.out.println();
		}
		for(int i=0;i<max;i++) {
			for(int x=1;x<=max-i;x++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	void pattern2(int max) {
		for(int i=0;i<max;i++) {
			for(int x=max;x>i;x--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		NumberPattern np = new NumberPattern();
//		np.printNumber(7);
//		np.addNumber(7);
//		np.thirdPattern(4);
//		np.pattern(8);
//		np.pattern1(8);
		np.pattern2(9);
	}
}
