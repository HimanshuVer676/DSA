class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashMap<Float, Integer> map = new HashMap<>();

        int start = 0; 
        int end = nums.length-1;
        float avg = 0;

        while(start < end){
            avg = 0;
            avg = (float)(nums[start] + nums[end])/2;
            map.put(avg, map.getOrDefault(avg, 0)+1);
            start++;
            end--;
        }

        return map.size();
    }
}