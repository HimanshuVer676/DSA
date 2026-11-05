class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        double sum = 0;
        for(int num : nums){
            sum += num;
            pq.add((double)num);
        }

        double temp = sum;
        int count = 0;
        while(temp > sum/2){
            double x = pq.poll();
            temp -= x/2.0;
            pq.add(x/2);
            count++;
        }

        return count;
    }
}