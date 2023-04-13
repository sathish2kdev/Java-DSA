package com.s1.practice.dsa;

class Node{
	int data;
	Node next;
	 Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SingleLinkedList {

	
	Node head;
	
	void insertAtBeginning(int data) {
		Node node= new Node(data);
		node.next = head;
		head = node;
	}
	
	void insertAtEnd(int data) {
		Node node = head;
		if(node == null)
			head = new Node(data);
		else {
			while(node.next != null) {
				node = node.next;
			}
			node.next =new Node(data); 
		}
	}
	
	void insertAtPosition(int pos,int data) {
		int actPos = 2;
		Node node = head;
		if(node == null)
			System.out.println("Node IS Empty");
		else {
			if(pos == 1)
				insertAtBeginning(data);
			else {
				while(node.next != null) {
					if(pos == actPos) {
						Node n1 = node.next;
						Node n2 =new Node(data);
						node.next = n2;
						n2.next = n1;
						break;
					}else {
						node = node.next;
						actPos++;
					}
						
				}
			}
		}
	}
	
	void deleteAtBeginning() {
		Node node = head;
		if(node == null)
			System.out.println("Node IS Empty");
		else {
			head = node.next;
		}
	}
	
	void deleteAtEnd() {
		Node node = head;
		if(node == null)
			System.out.println("Node IS Empty");
		else {
			while(node.next.next != null) {
				node = node.next;
			}
			node.next = null;
		}
	}
	
	void deleteAtPosition(int pos) {
		int actpos = 2;
		Node node = head;
		if(node == null)
			System.out.println("Node IS Empty");
		else {
			if(pos == 1)
				deleteAtBeginning();
			else {
				while(node.next != null) {
					if(pos == actpos) {
						Node n1 = node.next;
						if(n1.next != null)
							node.next = n1.next;
						else
							deleteAtEnd();
						break;
					}else {
						actpos++;
						node  = node.next;
					}
				}
				
			}
		}
	}
	
	void traverse() {
		Node node = head;
		while(node != null) {
			System.out.print(node.data+",");
			node = node.next;
		}
	}
	
	void sort() {
		Node node = head;
		if(node == null)
			System.out.println("Node IS Empty");
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
		SingleLinkedList s1 = new SingleLinkedList();
		s1.insertAtBeginning(2);
		s1.insertAtBeginning(1);
		s1.insertAtBeginning(0);
		s1.insertAtEnd(3);
		s1.insertAtEnd(4);
		s1.insertAtEnd(5);
		s1.insertAtPosition(3, 6);
//		s1.deleteAtBeginning();
	//	s1.deleteAtEnd();
//		s1.deleteAtPosition(7);
		s1.traverse(); 
		s1.sort();
		System.out.println();
		s1.traverse(); 
	}
}
