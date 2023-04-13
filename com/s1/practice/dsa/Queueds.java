package com.s1.practice.dsa;

public class Queueds {

	int[] arr;
	int front,rear;
	int size;
	
	public Queueds(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
	}
	
	void enqueue(int data) {
		if(isFull())
			System.err.println("Queue is Full");
		else {
			if(isEmpty()) {
				front++;
			}
			rear++;
			arr[rear] =data; 
		}
	}
	
	int dequeue() {
		if(isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		}
		else {
			return arr[front++];
		}
	}
	
	boolean isEmpty() {
		if(front == -1)
			return true;
		return false;
	}
	
	boolean isFull() {
		if(rear== size-1 && front == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Queueds ds = new Queueds(5);
		ds.enqueue(5);
		ds.enqueue(1);
		ds.enqueue(2);
		ds.enqueue(3);
		ds.enqueue(4);
		ds.enqueue(5);
		ds.dequeue();
		ds.dequeue();
	}
}
