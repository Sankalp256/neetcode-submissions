class Solution {
    public int maxProfit(int[] prices) {
        int l = 0,r = 1, profit = 0, res = 0;
        while (r < prices.length) {
            profit = prices[r] - prices[l];
            res = Math.max(res, profit);
            if(prices[r] < prices[l])
              l=r;
            r++;
        }
        return res;
    }
}
