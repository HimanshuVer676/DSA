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
    public int diameterOfBinaryTree(TreeNode root) {
        diam(root);
        return maxDiam;
    }

    int maxDiam = 0;

    public int diam(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = diam(root.left);
        int rh = diam(root.right);

        int self = Math.max(lh, rh) + 1;

        int selfdiam = Math.max(lh + rh + 1, Math.max(lh, rh)) - 1;
        maxDiam = Math.max(maxDiam, selfdiam);

        return self;

    }
}