class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int i=1;
        while(i<=n){
            evenSum += i*2;
            oddSum += (i*2-1);
            i++;
        }

        int x = evenSum;
        int y = oddSum;
        int res = -1;

        while(x>y){
            int rem = x % y;
            if(rem == 0){
                res = y;
                break;
            }
            x = y;
            y = rem;
        }
        return res;
    }
}