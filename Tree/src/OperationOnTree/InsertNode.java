package OperationOnTree;

import Tree.TreeNode;

public class InsertNode {
	
	public static void insert(TreeNode node,int value) {
		TreeNode insertnode = new TreeNode(value);
		if(value<node.value) {
			if(node.left!=null) {
				insert(node.left,value);
			}
			else {
				node.left = insertnode;
			}
		}
		else {
			if(node.right!=null) {
				insert(node.right,value);
			}
			else {
				node.right = insertnode;
			}
		}
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
		insert(root,17);
		TreeNode.printTree(root);
		
	}

}
