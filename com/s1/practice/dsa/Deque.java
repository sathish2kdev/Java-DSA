package com.s1.practice.dsa;

public class Deque {

	int[] arr;
	int front, rear;
	int size;

	Deque(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
	}

	boolean checkIsFull() {
		if ((front == 0 && rear == size - 1) || (front - 1 == rear))
			return true;
		return false;
	}

	boolean checkIsEmpty() {
		if (front == -1)
			return true;
		return false;
	}

	void enqueueFront(int data) {
		if(checkIsFull())
			System.err.println("Queue Is Full");
		else {
			if(checkIsEmpty()) {
				rear++;
			}
			if(	front == 0)
				front = size;
			front--;
			arr[front] = data;
		}
	}

	void enqueueRear(int data) {
		if(checkIsFull())
			System.err.println("Queue Is Full");
		else {
			if(checkIsEmpty())
				front++;
			rear++;
			rear = (rear%size);
			arr[rear]=data;
		}
	}
	
	void dequeFront() {
		if(checkIsEmpty())
			System.err.println("Queue is Empty");
		else {
			if(front == size)
				front = 0;
			arr[front++]=-1;
		}
	}
	
	void dequeRear() {
		if(checkIsEmpty())
			System.err.println("Queue is Empty");
		else {
			if(rear < 0)
				rear=size-1;
			arr[rear--]=-1;
		}
	}

	public static void main(String[] args) {
		Deque ds = new Deque(5);
		
		ds.enqueueRear(5);
		ds.enqueueRear(1);
		ds.enqueueFront(2);
		ds.enqueueFront(3);
		ds.enqueueFront(6);
		ds.enqueueFront(7);
		
		ds.dequeFront();
		ds.dequeFront();
		ds.dequeFront();
		ds.dequeFront();
		ds.dequeFront();
		ds.dequeFront();
	}
}
