package com.s1.practice.tree;

import com.s1.practice.tree.TreeTraversal.Node;

public class FullBinaryTree {

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

	boolean CheckFullBinaryTreeOrNot(Node node) {
		if (node == null)
			return true;
		if(node.left == null && node.right != null)
			return false;
		if(node.left != null && node.right == null)
			return false;
		return (CheckFullBinaryTreeOrNot(node.left) && CheckFullBinaryTreeOrNot(node.right));
	}

	public static void main(String[] args) {
		FullBinaryTree tree = new FullBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
	//	tree.root.left.right = new Node(6);
		
		if(tree.CheckFullBinaryTreeOrNot(tree.root)) {
			System.out.println("Full Binary Tree");
		}else
			System.out.println("False");
	}

}
