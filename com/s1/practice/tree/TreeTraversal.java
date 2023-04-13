package com.s1.practice.tree;

public class TreeTraversal {

	Node root;
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.data+" -> ");
		inorder(node.right);
	}
	
	void preOrder(Node node) {
		if(node == null)
			return;
		System.out.print(node.data+" -> ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	void postOrder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		inorder(node.right);
		System.out.print(node.data+" -> ");
		
	}
	
	public static void main(String[] args) {
		TreeTraversal tree  = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
		
		tree.inorder(tree.root);
		System.out.println();
		tree.preOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
	}
}
 