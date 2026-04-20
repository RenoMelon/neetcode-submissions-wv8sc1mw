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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    // Gaat de height returnen
    private int dfs(TreeNode currentNode){
        if(currentNode == null) return 0;

        int left = dfs(currentNode.left);
        int right = dfs(currentNode.right);

        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left,right);

    }
}
