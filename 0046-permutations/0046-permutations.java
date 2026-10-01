class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();

        find(nums, mainList, 0);

        return mainList;
    }

    public void find(int nums[], List<List<Integer>> mainList, int idx){
        if(idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }

            mainList.add(list);
            return;
        }

        for(int i=idx; i<nums.length; i++){
            swap(nums, i, idx);
            find(nums, mainList, idx+1);
            swap(nums, i, idx);
        }
    }

    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}