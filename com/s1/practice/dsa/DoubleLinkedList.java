package com.s1.practice.dsa;



public class DoubleLinkedList {

	class Node{
		int data;
		Node next;
		Node prev;
		 Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node head;
	
	void insertAtStart(int data) {
		Node node = new Node(data);
		if(head == null)
			head = node;
		else {
			
	  		node.next = head;
	  		node.next.prev = node;
//			node.prev = node;
			
			head = node;
		}
	}
	
	void insertAtEnd(int data) {
		Node node = head;
		if(node == null)
			node = new Node(data);
		else {
			while(node.next != null) {
				node = node.next;
			}
			Node n1 = new Node(data);
			n1.prev = node;
			node.next = n1;
		}
	}
	
	void traverse() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node  = node.next;
		}
	}
	
	void insertAtPosition(int pos,int data) {
		Node node = head;
		int actPos=2;
		if(node == null)
			node  = new Node(data);
		else {
			if(pos == 1)
				insertAtStart(data);
			else {
				while(node.next != null) {
					if(pos == actPos) {
						Node n1=node.next;
						Node n2 = new Node(data);
						n2.next = n1;
						n2.prev = node;
						n1.prev = n2;
						node.next = n2;
						break;
					}else {
						actPos++;
						node = node.next;
					}
				}
			}
		}
	}
	
	void deleteAtStart() {
		Node node  = head;
		if(node == null)
			System.err.println("Node is Empty");
		else {
			node.next.prev = null;
			head = node.next;
		}
	}
	void deleteAtEnd() {
		Node node = head;
		if(node == null)
			System.err.println("Node is Empty");
		else {
			while(node.next.next != null) {
				node = node.next;
			}
			
			node.next = null;
		}
	}
	
	void deleteAtPosition(int pos) {
		Node node = head;
		int actPos = 2;
		if(node == null)
			System.err.println("Node is Empty");
		else {
			if(pos == 1)
				deleteAtStart();
			else {
				while(node.next != null) {
					if(pos == actPos) {
						Node n1 = node.next;
						if(node.next.next != null) {
							n1.next.prev = node;
							node.next = n1.next;
						}else
							deleteAtEnd();
						break;
					}else {
						actPos++;
						node = node.next;
					}
				}
			}
		}
	}
	
	void sort() {
		Node node = head;
		if(node == null)
			System.err.println("Node is Empty");
		else {
			while(node.next != null) {
				if(node.data > node.next.data) {
					int temp = node.data;
					node.data = node.next.data;
					node.next.data = temp;
				}
				node = node.next;
			}
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.insertAtStart(2);
		dl.insertAtStart(1);
		dl.insertAtStart(0);
		dl.insertAtEnd(4);
		dl.insertAtEnd(5);
		dl.insertAtPosition(2, 6);;
		dl.traverse();
		System.out.println("AFter Deletion");
//		dl.deleteAtStart();
//		dl.deleteAtEnd();;
		//dl.deleteAtPosition(5);
		dl.sort();
		dl.traverse();
	}
}
