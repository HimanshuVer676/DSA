class Solution {

    public int firstOccurence(int nums[], int target){
    int start = 0; 
    int end = nums.length - 1;
    int first = -1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(nums[mid] == target){
            first = mid;
            end = mid - 1; // search left
        } else if(nums[mid] > target){
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return first;
}

    public int lastOccurence(int nums[], int target){
        int start = 0; 
        int end = nums.length - 1;
        int last = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                last = mid;
                start = mid + 1; // search right
            } else if(nums[mid] > target){
            end = mid - 1;
            } else {
            start = mid + 1;
        }
    }
    return last;
}

public int[] searchRange(int[] nums, int target) {
    return new int[]{
        firstOccurence(nums, target),
        lastOccurence(nums, target)
    };
}
}