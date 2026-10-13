class Solution {
    public static boolean isAnagram(String s, String t) {

        // if(s.length() != t.length()){
        //     return false;
        // }

        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // boolean bool = Arrays.equals(arr1,arr2);

        // return bool;

        HashMap<Character, Integer> map = new HashMap<>();

        boolean isValid = true;

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }

    // public static boolean isAnagram(String s, String t){

    //     if(s.length() != t.length()){
    //         return false;
    //     }

    //     int[] count = new int[26];
    //     for(int i=0; i<s.length(); i++){
    //         count[s.charAt(i) - 'a']++;
    //         count[t.charAt(i) - 'a']--;
    //     }

    //     for(int i=0; i<count.length; i++){
    //         if(count[i] != 0){
    //             return false;
    //         }
    //     }

    //     return true;
    // }
}