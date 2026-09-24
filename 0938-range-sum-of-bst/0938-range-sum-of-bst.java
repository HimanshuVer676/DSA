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
    public int rangeSumBST(TreeNode root, int low, int high) {
        findSum(root, low, high);
        return sum;
    }

    public int sum;
    public void findSum(TreeNode root, int low, int high){
        if(root == null) return;

        if(root.val >= low && root.val <= high){
            sum += root.val;
        }
        findSum(root.left, low, high);
        findSum(root.right, low, high);
    }
}