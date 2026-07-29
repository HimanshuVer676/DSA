class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int n = nums.length;
        // int ans[] = new int[n-k+1];
        // for(int i=0; i<n-k+1; i++){
        //     int maxNum = Integer.MIN_VALUE;
        //     for(int j=0; j<k; j++){
        //         int currNum = nums[i+j];
        //         maxNum = Math.max(currNum, maxNum);
        //     }
        //     ans[i] = maxNum;                               // exceeds Time limit 
        // }

        // return ans;


        int n = nums.length;
        int ans[] = new int[n-k+1];
        int ansIdx = 0;
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0; i<nums.length; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            // remove no. out of range k
            while(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.poll();
            }

            dq.offer(i);

            if(i >= k-1){
                ans[ansIdx++] = nums[dq.peek()];
            }
        }

        return ans;
    }
}