class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int pro = 1;
        int total = 0;
        while(n > 0){
            int r = n%10;
            sum += r;
            pro *= r;
            n = n/10;
        }
        
        total = sum + pro;
        boolean isDivisible = false;
        if(num % total == 0){
            isDivisible = true;
        }

        return isDivisible;
    }
}