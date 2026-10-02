class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        findList(nums, mainList, list, 0);

        return mainList;
    }

    public void findList(int nums[], List<List<Integer>> mainList, List<Integer> list, int i){
        if(i == nums.length){
            mainList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        findList(nums, mainList, list, i+1);
        list.remove(list.size()-1);
        while(i < nums.length-1 && nums[i] == nums[i+1] ){
            i++;
        }
        findList(nums, mainList, list, i+1);
    }

}