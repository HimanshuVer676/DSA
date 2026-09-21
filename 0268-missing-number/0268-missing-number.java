class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int first = 0;

        Arrays.sort(nums);

        if(nums[n-1] != n){
            return n;
        }

        int missNum = -1;
        for(int i=0; i<n; i++){
            if(nums[i] == first){
                first++;
            }else{
                missNum = first;
                break;
            }
        }

        return missNum;
    }
}