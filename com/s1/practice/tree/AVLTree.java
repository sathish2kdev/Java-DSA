package com.s1.practice.tree;

public class AVLTree {

	Node root;

	static class Node {
		int data, height;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.height = 1;
			this.left = null;
			this.right = null;
		}
	}

	int heightNode(Node node) {
		if (node == null)
			return 0;
		return node.height;
	}

	int maxHeight(int n1, int n2) {
		return (n1 > n2) ? n1 : n2;
	}
	
	int minHeight(int n1, int n2) {
		return (n1 < n2) ? n1 : n2;
	}

	int getBalanceFactor(Node node) {
		return (heightNode(node.left) - heightNode(node.right));
	}

	Node rightRotate(Node node) {
		Node n1 = node.left;
		Node n2 = n1.right;
		n1.right = node;
		node.left = n2;
		node.height = maxHeight(heightNode(node.left), heightNode(node.right)) + 1;
		n1.height = maxHeight(heightNode(n1.left), heightNode(n1.right)) + 1;
		return n1;
	}

	Node leftRotate(Node node) {
		Node n1 = node.right;
		Node n2 = n1.left;
		n1.left = node;
		node.left = n2;
		node.height = maxHeight(heightNode(node.left), heightNode(node.right)) + 1;
		n1.height = maxHeight(heightNode(n1.left), heightNode(n1.right)) + 1;
		return n1;
	}

	Node insertNode(Node node, int data) {
		if (node == null)
			return new Node(data);
		else if (data < node.data)
			node.left = insertNode(node.left, data);
		else if (data > node.data)
			node.right = insertNode(node.right, data);
		else
			return node;

		node.height = (1 + maxHeight(heightNode(node.left), heightNode(node.right)));
		int balanceFactor = getBalanceFactor(node);
		if (balanceFactor > 1) {
			if (data < node.left.data) {
				return rightRotate(node);
			} else if (data > node.left.data) {
				node.left = insertNode(node.left, data);
				return rightRotate(node);
			}
		} else if (balanceFactor < -1) {
			if (data > node.right.data) {
				return leftRotate(node);
			} else if (data < node.right.data) {
				node.right = insertNode(node.right, data);
				return leftRotate(node);
			}
		}
		return node;
	}
	
	int inOrderSuccessor(Node node) {
		int data = node.data;
		while(node.left != null) {
			node = node.left;
			data = node.data;
		}
		return data;
	}
	
	Node deleteNodeData(Node node,int data) {
		if(node == null)
			return node;
		else if(data < node.data) {
			node.left = deleteNodeData(node.left, data);
			//node.height = minHeight(heightNode(node.left), heightNode(node.right))+1;
		}		
		else if(data > node.data) {
			node.right = deleteNodeData(node.right, data);
		}
			
		else {
			if(node.left == null)
				return node.right;
			else if(node.right == null)
				return node.left;
			node.data = inOrderSuccessor(node.right);
			node.right = deleteNodeData(node.right, node.data);
			return node;
		}
		node.height = maxHeight(heightNode(node.left), heightNode(node.right))+1;
		int balanceFactor = getBalanceFactor(node);
		System.out.println(balanceFactor);
		if (balanceFactor > 1) {
			if (getBalanceFactor(node.left) >= 0) {
				return rightRotate(node);
			} else if (data > node.left.data) {
				node.left = insertNode(node.left, data);
				return rightRotate(node);
			}
		} else if (balanceFactor < -1) {
			if (getBalanceFactor(node.right) <= 0) {
				return leftRotate(node);
			} else if (data < node.right.data) {
				node.right = insertNode(node.right, data);
				return leftRotate(node);
			}
		}
		return node;
	}

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		tree.root = tree.insertNode(tree.root, 33);
		tree.root = tree.insertNode(tree.root, 13);
		tree.root = tree.insertNode(tree.root, 53);
		tree.root = tree.insertNode(tree.root, 9);
		tree.root = tree.insertNode(tree.root, 21);
		tree.root = tree.insertNode(tree.root, 61);
		tree.root = tree.insertNode(tree.root, 8);
		tree.root = tree.insertNode(tree.root, 11);
		tree.root = tree.insertNode(tree.root, 7);
		
		tree.root = tree.deleteNodeData(tree.root, 61);
	}
}
