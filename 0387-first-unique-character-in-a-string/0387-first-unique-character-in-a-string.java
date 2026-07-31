class Solution {
    public int firstUniqChar(String s) {
        // int freq[] = new int[26];
        // Queue<Integer> q = new LinkedList<>();

        // for(int i=0; i<s.length(); i++){
        //     freq[s.charAt(i)-'a']++;
        //     q.add(i);

        //     while(!q.isEmpty() && freq[s.charAt(q.peek())-'a'] > 1){
        //         q.remove();
        //     }
        // }

        // return q.isEmpty() ? -1 : q.peek();

        int freq[] = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}