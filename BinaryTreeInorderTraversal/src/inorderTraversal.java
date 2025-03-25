import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversalSolution(TreeNode root) {
        ans.clear();
        inorderHelper(root);
        return ans;
    }

    public List<Integer> inorderHelper(TreeNode node){
        if(node == null){
            return null;
        }
        inorderHelper(node.left);
        ans.add(node.val);
        inorderHelper(node.right);
        return ans;
    }
    
}
