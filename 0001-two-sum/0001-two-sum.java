class Solution {
    public int[] twoSum(int[] nums, int target) {
    //    for(int i=0; i<nums.length; i++){
    //     for(int j=i+1; j<nums.length; j++){
    //         int sum = nums[i] + nums[j];
    //         if(sum == target){
    //             return new int[]{i, j};
    //         }
    //     }
    //    }
    //    return new int[]{-1, -1};

    // <----------------------- ----------------------->
        HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], i);
        // }

        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(target-nums[i]) && i != map.get(target-nums[i])){
        //         return new int[]{i, map.get(target-nums[i])};
        //     }
        // }

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};

    }
}