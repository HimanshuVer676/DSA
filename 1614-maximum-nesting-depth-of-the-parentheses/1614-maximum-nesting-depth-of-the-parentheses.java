class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();

        int currCount = 0;
        int maxCount = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                currCount++;
            }else if(ch == ')'){
                st.pop();
                maxCount = Math.max(currCount, maxCount);
                currCount--;
            }else{
                continue;
            }
        }

        return maxCount;
    }
}