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
    int postIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        postIdx = postorder.length-1;
        TreeNode root = dfs(inorder, postorder, 0, inorder.length-1);

        return root;
    }

    public TreeNode dfs(int inorder[], int postorder[], int start, int end){
        if(start > end){
            return null;
        }

        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);

        int mid = start;

        for(int i=start; i<=end; i++){
            if(inorder[i] == root.val){
                mid = i;
                break;
            }
        }

        root.right = dfs(inorder, postorder, mid+1, end);
        root.left = dfs(inorder, postorder, start, mid-1);

        return root;
    }
}