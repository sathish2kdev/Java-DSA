package com.s1.practice.dsa;

public class CircularQueueds {

	int[] arr;
	int front,rear;
	int size;
	
	public CircularQueueds(int size) {
		this.size = size;
		this.front=-1;
		this.rear=-1;
		this.arr = new int[size];
	}
	
	void enqueue(int data) {
		if(isFull()) {
			System.err.println("Stack is Full");
		}else {
			if(isEmpty())
				front++;
			rear++;
			rear=rear%size;
			System.out.println((rear%size));
			arr[rear]  = data;
			
		}
	}
	
	void dequeue() {
		if(isEmpty())
			System.err.println("Stack is Empty");
		else {
			arr[front] = -1;
			front++;
			front =front%size; 
		}
	}
	
	boolean isFull() {
		if((front ==0 && rear == size-1) || (front-1 == rear)) 
			return true;
		return false;
	}
	
	boolean isEmpty() {
		if(rear == -1)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		CircularQueueds ds = new CircularQueueds(5);
		ds.enqueue(5);
		ds.enqueue(1);
		ds.enqueue(2);
		ds.enqueue(3);
		ds.enqueue(4);
		ds.enqueue(5);
		
		ds.dequeue();
		ds.dequeue();
		ds.dequeue();
		ds.dequeue();
		ds.dequeue();
		
	}
}
