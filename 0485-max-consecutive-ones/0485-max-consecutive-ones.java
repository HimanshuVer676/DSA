class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;

        int currOne = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                currOne++;
            }else{
                currOne = 0;
            }
            maxOnes = Math.max(currOne, maxOnes);
        }

        return maxOnes;
    }
}