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
    
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        boolean isTrue = true;
        int data = root.val;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(curr.val != data){
                    isTrue = false;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            
        }
        return isTrue;

    }
}