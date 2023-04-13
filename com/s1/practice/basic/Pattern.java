package com.s1.practice.basic;

public class Pattern {

	public static void main(String[] args) {
		int data = 4;
		for (int i = 0; i < data; i++) {
			int sam = data;
			for (int j = 0; j < data; j++) {
				if (i < data / 2) {
					if (j <= i && j != 0)
						sam--;
					else if ((i + j) >= data)
						sam++;
				} else {
					if ((i + j) < data && j != 0)
						sam--;
					else if ((i + j) > data && j > i)
						sam++;
				}

				System.out.print(sam + " ");
			}
			System.out.println();
		}
	}
}
