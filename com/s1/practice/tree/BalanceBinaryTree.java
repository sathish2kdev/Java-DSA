package com.s1.practice.tree;

public class BalanceBinaryTree {

	Node root;
	Height height;
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
	
	static class Height{
		int height = 0;
		public Height() {
		}
	}
	
	boolean checkBalanceOrNot(Node node,Height h1) {
		if(node == null) {
			h1.height = 0;
			return true;
		}
		
		Height leftH = new Height(),rHeight = new Height();
		boolean lH = checkBalanceOrNot(node.left, leftH);
		boolean rH = checkBalanceOrNot(node.right, rHeight);
		int leftInt = leftH.height;
		int rightInt = rHeight.height;
		h1.height = (leftInt>rightInt?leftInt:rightInt)+1;
		if((leftInt-rightInt) >1 || (rightInt-leftInt) >1)
				return false;
		else 
			return lH&&rH;
	}
	 
	public static void main(String[] args) {
		BalanceBinaryTree tree = new BalanceBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
		//tree.root.left.left.left = new Node(6);
		//tree.root.right.left = new Node(6);
		tree.height = new Height();
		if(tree.checkBalanceOrNot(tree.root,tree.height)) {
			System.out.println("Balance Tree");
		}else
			System.out.println("false");
	}
}
