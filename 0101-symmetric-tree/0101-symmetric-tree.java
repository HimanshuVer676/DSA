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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode Lroot, TreeNode Rroot){
        if(Lroot == null && Rroot == null) return true;
        else if(Lroot == null || Rroot == null) return false;

        if(Lroot.val != Rroot.val) return false;

        return isMirror(Lroot.left, Rroot.right) && isMirror(Lroot.right, Rroot.left);
    }
}