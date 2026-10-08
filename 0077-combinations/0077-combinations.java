class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        combinations(n, k, result, curr, 1);

        return result;
    }

    public void combinations(int n, int k, List<List<Integer>> result, List<Integer> curr, int i){
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int j=i; j<=n; j++){
            curr.add(j);
            combinations(n, k, result, curr, j+1);
            curr.remove(curr.size()-1);
        }
    }
}