class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // for(int i=0; i<nums.length; i++){
        //     pq.add(nums[i]);
        // }

        // int i=1; 
        // while(i < k){
        //     pq.remove();
        //     i++;
        // }

        // return pq.remove();

        Arrays.sort(nums);

        return nums[nums.length-k];
    }
}