class Solution {
    public int maxProfit(int[] prices) {

        // 2 pointers, maar nu beide links, maar right = left + 1. Als right - left negatief is dan
        // schuiven we links ook op, anders blijven we rechts doorschuiven. Ik ga ook een int
        // maxProfit bijhouden die ik alleen update als de huidige waarde groter is dan de vorige 

        int left = 0;
        int right = left + 1;
        int maxProfit = 0;

        while(right < prices.length){
            int profit = prices[right] - prices[left];
            if(profit < 0){
                left = right;
                right++;
            }else if(profit >= 0){
                right++;
            }

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;

    }
}
