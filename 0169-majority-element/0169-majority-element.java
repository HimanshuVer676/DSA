class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer ans = 0;
        for(int i=0; i<nums.length; i++){
            // int num = nums[i];
            // if(map.containsKey(num)){
            //     map(num, map.get(num)+1);
            // }else{
            //     map.put(num, 1);
            // }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Set<Integer> keyset = map.keySet();
        for(Integer key : keyset){
            if(map.get(key) > nums.length/2){
                ans = key;
            }
        }

        return ans;
    }
}