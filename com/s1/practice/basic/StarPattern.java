package com.s1.practice.basic;

public class StarPattern {

	void patterStar1() {
		int row =5,column=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	//2) Left Triangle
	void leftTriangle(int max) {
//		for(int i=max;i>0;i--) {
//			for(int j=1;j<=max;j++) {
//				if(j>=i)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		for(int i=max;i>0;i--) {
			for(int j=1;j<=max;j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	
	}
	
	//3) Pyramid Traingle Star
	void pyramidTriangle(int max) {
		for(int i=0;i<max;i++) {
			for(int j=max;j>i;j--) {
				if(j<=i)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//4) Diamond Shape
	void diamond(int max) {
		for(int i=0;i<max;i++) {
			for(int j=max-1;j>0;j--) {
				if(i>=j) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			for(int j=0;j<max;j++) {
				if(j<=i)
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<max-1;i++) {
			for(int j=0;j<max-1;j++) {
				if(j>i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<max;j++) {
				if(i<j)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	void upperTriangel(int max) {
		for(int i=0;i<max;i++) {
			for(int x=max-1;x>0;x--) {
				if(i>=x) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			for(int x=0;x<max;x++) {
				if(x<=i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void lowerTriangle(int max) {
		for(int i=0;i<max;i++) {
			for(int j=0;j<max-1;j++) {
				if(j>=i) {
					System.out.print("*");
				}else
					System.out.print(" ");
					
			}
			for(int j=max;j>i;j--) {
				if(j>=i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	void diff(int max) {
		for(int i=0;i<max;i++) {
			for(int j=max-1;j>=0;j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void rightPascal(int max) {
		for(int i=0;i<max;i++) {
			for(int j=0;j<=i;j++) {
				if(j<=i)
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<max-1;i++) {
			for(int j=max-1;j>i;j--) {
				if(j>i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void leftPascal(int max) {
		for(int i=0;i<=max;i++) {
			for(int j=max;j>0;j--) {
				if(j<=i)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<max;i++) {
			for(int j=0;j<max;j++) {
				if(j>i)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	void sandBox(int max) {
		for(int i=0;i<max;i++) {
			for(int j=0;j<max;j++) {
				if(i<=j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<max;i++) {
			for(int j=max-1;j>i;j--) {
				if(j<=i)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		StarPattern str = new StarPattern();
		//str.patterStar1();
		//str.leftTriangle(5);
//		str.pyramidTriangle(6);
	//	str.diamond(5);
//		str.upperTriangel(5);
//		str.lowerTriangle(4);
//		str.diff(5);
		//str.rightPascal(5);
	//	str.leftPascal(5);
		str.sandBox(8);
	}
}
