class Solution {

    public void subsets(int nums[], List<List<Integer>> mainList, List<Integer> list, int i){
        if(i == nums.length){
            mainList.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[i]);
        subsets(nums, mainList, list, i+1);
        list.remove(list.size()-1);
        subsets(nums, mainList, list, i+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        subsets(nums, mainList, list, 0);
        return mainList;
    }
}