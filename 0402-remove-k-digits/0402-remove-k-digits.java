class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";

        Stack<Character> st = new Stack<>();

        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            if(st.isEmpty() && ch == '0'){
                continue;
            }
            st.push(ch);
        }

        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        if(sb.length() == 0){
            return "0";
        }

        

        return sb.reverse().toString();
    }
}