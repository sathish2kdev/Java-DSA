package com.s1.practice.strings;

public class Asccii {

	void printchartoassci() {
		for(char a='a';a<='z';a++) {
			int i = (int)a;
			System.out.println("char => "+a+" ascci value => "+i);
		}
	}
	
	public static void main(String[] args) {
		Asccii s = new Asccii();
		s.printchartoassci();
	}
}
