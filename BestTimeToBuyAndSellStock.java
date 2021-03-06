class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int maxCur = 0, maxSoFar=0;
        for(int i = 1; i < prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }
        return maxSoFar;
    }
}