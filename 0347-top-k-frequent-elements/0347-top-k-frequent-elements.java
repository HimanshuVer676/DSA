class Solution {
    public class Info implements Comparable<Info>{
        int val;
        int idx;

        Info(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Info info2){
            return this.idx - info2.idx;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans[] = new int[k];

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Info> pq = new PriorityQueue<>();

        for(int key : map.keySet()){
            pq.add(new Info(key, map.get(key)));

            if(pq.size() > k){
                pq.remove();
            }
        }

        int i = 0;
        while(!pq.isEmpty()){
            ans[i] = pq.remove().val;
            i++;
        }

        return ans;
    }
}