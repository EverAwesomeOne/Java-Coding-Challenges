package TopInterview150;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println("expected 0; actual " + maxProfit(prices));

        int[] prices2 = {7,1,5,3,6,4};
        System.out.println("expected 5; actual " + maxProfit(prices2));

        int[] prices3 = {2,1,2,1,0,1,2};
        System.out.println("expected 2; actual " + maxProfit(prices3));

        int[] prices4 = {2,4,1};
        System.out.println("expected 2; actual " + maxProfit(prices4));

        int[] prices5 = {3,2,6,5,0,3};
        System.out.println("expected 4; actual " + maxProfit(prices5));



    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}
