class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
            //calculate profit if sold today
            int profit = prices[i] - minPrice;

            //update maximum profit
            maxProfit = Math.max(maxProfit,profit);

            //update minimum buying price
            minPrice = Math.min(minPrice,prices[i]);
        }
        return maxProfit;
    }
}