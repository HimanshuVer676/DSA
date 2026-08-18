class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(n<0){
            x = 1/x;
            N = -(N);  // changing to postive exponent
        }

        return findPow(x, n);
    }

    double findPow(double x, int n){
        if(n == 0){
            return 1;
        }

        double half = findPow(x, n/2);
        double halfpow = half * half;

        if(n%2 != 0){
            halfpow = halfpow * x;
        }

        return halfpow;
    }
}