package Tree;

public class TreeNode {
	
	public int value ;
	public TreeNode left ;
	public TreeNode right;
	public TreeNode root;
	
	public TreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
		
	}
	
//	public static void printTree(TreeNode node) {
//		if(node==null) {
//			return;
//		}
//		System.out.print(node.value);
////		System.out.println(" ");
////		System.out.println("|");
//		printTree(node.left);
////		System.out.println("|");
//		printTree(node.right);
////		System.out.println("|");
//	}

	public static void printTree(TreeNode node) {
	    printTreeHelper(node, "");
	}

	private static void printTreeHelper(TreeNode node, String prefix) {
	    if (node == null) {
	        return;
	    }
	    
	    // Print the current node with its prefix
	    System.out.println(prefix + "|-- " + node.value);
	    
	    // Update the prefix for children and make recursive calls
	    printTreeHelper(node.left, prefix + "   ");  // Left child
	    printTreeHelper(node.right, prefix + "   "); // Right child
	}

}
