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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        dfs(root, ans, map);

        return ans;
    }

    public String dfs(TreeNode root, List<TreeNode> ans, HashMap<String, Integer> map){
        if(root == null) return "#";

        String left = dfs(root.left, ans, map);
        String right = dfs(root.right, ans, map);

        String str = left+","+right+","+root.val;          //String.valueOf(root.val);

        if(map.containsKey(str)){
            if(map.get(str) == 1){
                ans.add(root);
            }
            map.put(str, map.get(str)+1);
        }else{
            map.put(str, 1);
        }

        return str;
    }
}