package Tree;

public class TreeOperations {
	
	public static void inOrder(TreeNode node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value);
		inOrder(node.right);
			
	}
	
	public static void preOrder(TreeNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.value);
		preOrder(node.left);
		preOrder(node.right);
			
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
//		inOrder(root);
//		preOrder(root);
		TreeNode.printTree(root);
		
	}

}
