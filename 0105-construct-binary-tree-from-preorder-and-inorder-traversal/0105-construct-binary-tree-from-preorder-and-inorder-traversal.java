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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = dfs(preorder, inorder, 0, inorder.length-1);
        return root;

    }

    int preIndex = 0;

    public TreeNode dfs(int preorder[], int inorder[], int start, int end){

        if(start > end){
            return null;
        }
        
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int mid = start;

        for(int i=start; i<=end; i++){
            if(inorder[i] == root.val){
                mid = i;
                break;
            }
        }

        root.left = dfs(preorder, inorder, start, mid-1);
        root.right = dfs(preorder, inorder, mid+1, end);

        return root;
    }


}