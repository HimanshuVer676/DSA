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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        pathSum(root, targetSum, result, list);
        return result;
    }

    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> list){
        if(root == null) return;

        targetSum = targetSum - root.val;
        list.add(root.val);

        if(root.left == null && root.right == null && targetSum == 0){
            result.add(new ArrayList<>(list));
        }

        pathSum(root.left, targetSum, result, list);
        pathSum(root.right, targetSum, result, list);
        list.remove(list.size()-1);
    }
}