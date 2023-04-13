package com.s1.practice.dsa;

public class CircularLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;

	void insertStart(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			Node n1 = tail;
			while (n1.next != null) {
				if (n1.next.data == head.data)
					break;
				n1 = n1.next;
			}
			node.next = head;
			n1.next = node;
			head = node;
			tail = node;
		}
	}
	
	void insertEnd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			Node n1 = tail;
			while(n1.next != null) {
				if(n1.next.data == head.data)
					break;
				n1 = n1.next;
			}
			node.next = head;
			n1.next = node;
		}
	}

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
		CircularLinkedList cls = new CircularLinkedList();
//		cls.insertStart(2);
//		cls.insertStart(1);
//		cls.insertStart(0);
		
		
		cls.insertEnd(0);
		cls.insertEnd(1);
		cls.insertEnd(2);
	}
}
