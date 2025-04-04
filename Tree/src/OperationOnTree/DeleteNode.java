package OperationOnTree;

import Tree.TreeNode;

public class DeleteNode {
	
	public static TreeNode delete(TreeNode node,int value) {
		if(node==null) {return null ;}
		
		if(node.value==value) {return null ;}
		
		if(value<node.value) {
			if(node.left!=null) { delete(node.left,value);node.left = null;return node; }
		}
		else if(value>node.value) {
			if(node.right!=null) { delete(node.right,value);node.right = null;return node; }
		}
		return node;
		
	}
	
	public static int findMin(TreeNode node) {
		int min = node.value;
		if(node.left==null) {return node.value;}
		
		return min;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.right = new TreeNode(19);
		root.left.left = new TreeNode(2);
		root.right.left = new TreeNode(15);
		root.right.left.left = new TreeNode(11);
		root.right.left.left.right = new TreeNode(12);
		root.right.right = new TreeNode(20);
		root.right.right.right = new TreeNode(22);
		root.right.right.right.left = new TreeNode(21);
		root.right.right.right.right = new TreeNode(25);
//		TreeNode root = null;
		delete(root,20);
		TreeNode.printTree(root);
		
	}

}
