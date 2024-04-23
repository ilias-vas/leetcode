import javax.swing.tree.TreeNode;

import com.sun.source.tree.Tree;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        TreeNode currentNode = root.left;
        root.left = root.right;
        root.right = currentNode;

        return root;
    }
}
