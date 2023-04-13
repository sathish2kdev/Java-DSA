package com.s1.practice.tree;

public class PerfectBinaryTree {

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

	boolean checkPerfectOrNot(Node node) {
		int index = 0;
		int depth = depth(node);
		return validateNode(node, index, depth);
	}

	boolean validateNode(Node node, int i, int dept) {
		if (node == null)
			return true;
		if (node.left == null && node.right != null)
			return false;
		if (node.left != null && node.right == null)
			return false;
		else if (node.left == null && node.right == null)
			return (i == dept-1);

		return (validateNode(node.left, i + 1, dept) && validateNode(node.right, i + 1, dept));
	}

	int depth(Node node) {
		int i = 0;
		while (node != null) {
			i++;
			node = node.left;
		}
		return i;
	}

	public static void main(String[] args) {
		PerfectBinaryTree tree = new PerfectBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		if (tree.checkPerfectOrNot(tree.root)) {
			System.out.println("Perfect Binary Tree");
		} else
			System.out.println("False");
	}
}
