package com.s1.practice.dsa;

public class Stackds {

	int[] arr;
	int top;
	int capacity;

	Stackds(int capacity) {
		this.top = -1;
		this.capacity = capacity;
		arr = new int[capacity];
	}

	void push(int data) {
		if(isFull()) {
			System.err.println("Stack is Full");
		}else {
			if(isEmpty())
				top++;
			arr[top++] = data;
		}
	}

	int pop() {
		if(isEmpty()) {
			System.err.println("Stack is Empty");
			return 0;
		}
		top--;
			return arr[top];
	}

	boolean isFull() {
		if (top == capacity )
			return true;
		return false;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Stackds ds = new Stackds(5);
		ds.push(0);
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.pop();
		ds.pop();
	}
}
