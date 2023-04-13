package com.s1.practice.tree;

import com.s1.practice.tree.PerfectBinaryTree.Node;

public class CompleteBinaryTree {

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

	int findTotal(Node node) {
		if (node == null)
			return 0;
		return (1 + findTotal(node.left) + findTotal(node.right));
	}

	boolean isCompleteOrNot(Node node, int i, int len) {
		if (node == null)
			return true;
		if (i >= len)
			return false;
		return (isCompleteOrNot(node.left, 2 * i + 1, len) && isCompleteOrNot(node.right, 2 * i + 2, len));
	}

	public static void main(String[] args) {
		CompleteBinaryTree tree = new CompleteBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		int total = tree.findTotal(tree.root);
		if (tree.isCompleteOrNot(tree.root, 0, total)) {
			System.out.println("Complete Binary Tree");
		} else
			System.out.println("False");
	}
}
