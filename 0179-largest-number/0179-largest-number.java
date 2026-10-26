class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(String.valueOf(nums[i]));
        }

        Collections.sort(list, (s1, s2) -> {
            return (s2+s1).compareTo(s1+s2);
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++){ 
            sb.append(list.get(i));
        }

        String ans = sb.toString();

        if(ans.charAt(0) == '0'){
            return "0";
        }else{
            return ans;
        }
    }
}