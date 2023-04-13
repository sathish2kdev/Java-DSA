package com.s1.practice.tree;

public class BinarySearchTree {

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

	void Search(Node node, int ele) {
		if (node == null)
			System.out.println("Element Not Found");
		else if (node.data == ele)
			System.out.println("Element Found");
		else if (ele < node.data)
			Search(node.left, ele);
		else if (ele > node.data)
			Search(node.right, ele);
	}

	Node insert(Node node, int ele) {
		if (node == null) {
			node = new Node(ele);
			return node;
		}

		else if (node.data == ele) {
			System.out.println("Element Found");
			return null;
		}

		else if (ele < node.data)
			node.left = insert(node.left, ele);
		else if (ele > node.data)
			node.right = insert(node.right, ele);
		return node;

	}

	void inorderTraversal(Node node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.data + " -> ");
		inorderTraversal(node.right);
	}

	// Find the inorder successor
	int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}

	Node deleteKey(int i) {
		return deleteTreeData(root, i);
	}

	int findInorderSuccessor(Node node) {
		int min = node.data;
		while (node.left != null) {
			node = node.left;
			min = node.data;
		}
		return min;
	}

	Node deleteTreeData(Node node, int i) {
		if (root == null)
			return node;
		else if (i < node.data)
			node.left = deleteTreeData(node.left, i);
		else if (i > node.data)
			node.right = deleteTreeData(node.right, i);
		else {
			if (node.left == null)
				return node.right;
			else if (node.right == null)
				return node.left;
			node.data = findInorderSuccessor(node.right);
			node.right = deleteTreeData(node.right, node.data);
		}
		return node;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		// tree.root.left.right.left = new Node(4);
		// tree.Search(tree.root, 4);
		tree.insert(tree.root, 4);
		tree.inorderTraversal(tree.root);

		tree.deleteKey(3);

	}

}
