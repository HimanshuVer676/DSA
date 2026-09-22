class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int first = 0;

        // Arrays.sort(nums);

        // if(nums[n-1] != n){
        //     return n;
        // }

        // int missNum = -1;
        // for(int i=0; i<n; i++){
        //     if(nums[i] == first){
        //         first++;
        //     }else{
        //         missNum = first;
        //         break;
        //     }
        // }

        // return missNum;

        int n = nums.length;
        int totalSum = (n*(n+1))/2;

        int currSum = 0;

        for(int i=0; i<nums.length; i++){
            currSum += nums[i];
        }

        return totalSum - currSum;
    }
}