class Solution {
    public boolean isBalanced(String num) {
        if(num.length() == 0) return false;
        int oddSum = 0; 
        int evenSum = 0;

        for(int i=0; i<num.length(); i++){
            int n = num.charAt(i) - '0';
            if(i % 2 == 0){
                oddSum += n;
            }else{
                evenSum += n;
            }
        }

        return oddSum == evenSum;
    }
}