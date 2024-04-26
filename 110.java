/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
 * create a method to check the height. If the root is null just return -1 as 0 would mean that it does exist but it just has a height of 0
 * check the height of each subtree recursively by taking the max of the left and right nodes + 1 to account for the 0
 * return the height
 * then in the isBalanced method, if the root is null return true as its an empty tree.
 * otherwise, return true if the absolute value of height(root.left) - height(root.right) is less than 2.
 * In that same statement, make sure we also call the isBalanced function recursively on root.left and root.right to make sure we are making sure
 * that we do this process for every node as the question states
 */

class Solution {
    public int height(TreeNode root) {
        if (root == null) return -1;
        int height = Math.max(height(root.left), height(root.right)) + 1;
        return height;
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
}
