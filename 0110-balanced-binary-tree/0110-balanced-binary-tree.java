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
    boolean isBalance;

    public boolean isBalanced(TreeNode root) {
        isBalance = true;
        dfs(root);
        return isBalance;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = dfs(root.left);
        int rh = dfs(root.right);

        if(Math.abs(lh - rh) > 1){
            isBalance = false;
        }

        return Math.max(lh, rh) + 1;
        
    }
}