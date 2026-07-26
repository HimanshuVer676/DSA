class Solution {
    public String decodeString(String s) {

        Stack<Integer> numSt = new Stack<>();
        Stack<StringBuilder> strSt = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 0;
        for(Character c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                int n = c - '0';
                num = num*10 + n; 
            }else if (c == '[') {
                strSt.push(sb);
                sb = new StringBuilder();
                numSt.push(num);
                num = 0;
            }else if(c == ']'){
                StringBuilder temp = sb;
                sb = strSt.pop();
                int count = numSt.pop();
                
                while(count > 0){
                    sb.append(temp);
                    count--;
                }
            }else{
                sb.append(c);
            }

        }

        return sb.toString();
    }
}