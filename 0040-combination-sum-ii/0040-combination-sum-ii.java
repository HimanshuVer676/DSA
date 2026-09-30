class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);

        combination(candidates, target, result, list, 0);

        return result;
    }

    public void combination(int candidates[], int target, List<List<Integer>> result, List<Integer> list, int i){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        if(target < 0 || i == candidates.length) return;
        
        list.add(candidates[i]);
        combination(candidates, target-candidates[i], result, list, i+1);
        list.remove(list.size()-1);
        while(i<candidates.length-1 && candidates[i] == candidates[i+1]){
            i++;
        }
        combination(candidates, target, result, list, i+1);
    }
}