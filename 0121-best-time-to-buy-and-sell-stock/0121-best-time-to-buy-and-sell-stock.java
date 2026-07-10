class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int buyAt = prices[0];
        for(int i=1; i<prices.length; i++){
            if(buyAt >= prices[i]){
                buyAt = prices[i];
            }else{
                int currPro = prices[i] - buyAt;
                maxPro = Math.max(currPro, maxPro);
            }
        } 

        return maxPro;
    }
}