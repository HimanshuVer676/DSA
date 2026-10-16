class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
        // Collections.sort(nums);
        // return findPairs(nums, target, 0, nums.length-1);
    }

    // public int findPairs(List<Integer> nums, int target, int start, int end){
    //     while(start<end){

    //     }
    // }
}