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
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null) return null;
        root = delNode(root, key);
        return root;
        
    }  

    public TreeNode delNode(TreeNode root, int key){
        if(root.val > key){
           root.left = deleteNode(root.left, key);
        }else if(root.val <key){
            root.right = deleteNode(root.right, key);
        }else{

            if(root.left == null && root.right == null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            TreeNode InSuc = inSucc(root.right);
            root.val = InSuc.val;
            root.right = deleteNode(root.right, InSuc.val);
        }

        return root;
    }

    public TreeNode inSucc(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }  
}