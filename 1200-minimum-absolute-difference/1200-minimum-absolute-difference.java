class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDis = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if( (arr[i+1] - arr[i]) < minDis ){
                minDis = arr[i+1] - arr[i];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            curr = new ArrayList<>();
            if( (arr[i+1] - arr[i]) == minDis ){
                curr.add(arr[i]);
                curr.add(arr[i+1]);
            }
            if(curr.size() > 0){
                ans.add(curr);
            }
        }

        return ans;
    }
}