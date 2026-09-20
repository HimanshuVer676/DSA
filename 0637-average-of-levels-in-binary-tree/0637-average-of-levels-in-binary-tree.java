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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        List<Double> list = new ArrayList<>();

        q.add(root);
        q.add(null);

        // double avg = 0;
        double sum = 0;
        int i=0;

        while(!q.isEmpty()){
            TreeNode curr = q.remove();

            if(curr == null){
                list.add(sum/i);
                sum = 0;
                i = 0;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                i++;
                sum += curr.val;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        return list;

    }
}