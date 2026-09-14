class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        combination(candidates, target, resultList, list, 0);

        return resultList;
    }

    public int sum = 0;

    public void combination(int candidates[], int target, List<List<Integer>> resultList, List<Integer> list, int i){

        if(target == 0){
            resultList.add(new ArrayList<>(list));
            return;
        }
        
        if(target < 0 || i == candidates.length){
            return;
        }

        list.add(candidates[i]);
        combination(candidates, target - candidates[i], resultList, list, i);
        
        list.remove(list.size()-1);
        combination(candidates, target, resultList, list, i+1);
        
    }
}