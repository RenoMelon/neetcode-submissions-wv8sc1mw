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

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(dfs(root) != -1) return true;

        return false;
    }

    // hoogte berekenen
    private int dfs(TreeNode currentNode){
        if(currentNode == null) return 0;

        int left = dfs(currentNode.left);
        int right = dfs(currentNode.right);

        if(left == -1 || right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left,right);
    }
}
