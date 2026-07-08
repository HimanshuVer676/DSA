class Solution {
    public int maxDigitRange(int[] arr) {
        int range[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(n > 0){
                int num = n % 10;
                min = Math.min(min, num);
                max = Math.max(max, num);
                n = n/10;
            }
            range[i] = max - min;
        }

        int maxRange = range[0];
        
        for(int i=1; i<range.length; i++){
            if(range[i] > maxRange){
                maxRange = range[i];
            }
        }

        int sum = 0;

        for(int i=0; i<range.length; i++){
            if(range[i] == maxRange){
                sum += arr[i];
            }
        }

        return sum;
    }
}