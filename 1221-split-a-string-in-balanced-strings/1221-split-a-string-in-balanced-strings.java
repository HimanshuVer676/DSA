class Solution {
    public int balancedStringSplit(String s) {
        int bal = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'R'){
                bal--;
            }else{
                bal++;
            }

            if(bal == 0){
                count++;
            }
        }

        return count;
    }
}