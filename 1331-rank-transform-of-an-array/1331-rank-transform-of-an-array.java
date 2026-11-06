class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ranks[] = new int[arr.length];

        int dummy[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            dummy[i] = arr[i];
        }

        Arrays.sort(dummy);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<dummy.length; i++){
            if(!map.containsKey(dummy[i])){
                map.put(dummy[i], map.size()+1);
            }
        }

        for(int i=0; i<arr.length; i++){
            ranks[i] = map.get(arr[i]);
        }

        return ranks;
    }
}