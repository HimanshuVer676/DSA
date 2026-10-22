class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                q.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
         

        int arr[] = new int[q.size()];
        int j=0;
        while(!q.isEmpty()){
            arr[j] = q.remove();
            j++;
        }

        return arr;
    }
}