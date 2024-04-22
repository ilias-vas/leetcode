// set l, r, maxprofit variables
// two pointers, left pointer for buying right for selling.
// if the right pointer is greater than the left pointer, set the profit to r-l
// use max method to check if the maxprofit is greater then the profit just calculated and update
// max profit if it is
// increment the right pointer only
// if the sell price is less than the buy price, set the buy poitner to the current sell pointer
// and increment the sell pointer by 1
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                int profit = prices[r] - prices[l]; 
                maxProfit = Math.max(maxProfit, profit);
                r++;
            } else {
                l = r;
                r++;
            }
        }
        return maxProfit;
    }
}
