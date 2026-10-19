class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }

        int j = 0;
        for(int i=n; i<ans.length; i++){
            if(j < nums.length){
                ans[i] = nums[j];
                j++;
            }
        }

        return ans;
    }
}