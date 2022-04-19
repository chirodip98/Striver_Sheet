public class BuySellStock {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/1962658/Best-Time-to-Buy-and-Sell-Stock


    public static int MaxProfit(int prices[])
    {
        int best_buy_price=prices[0];
        int best_sell_prices=Integer.MIN_VALUE;
        int max_profit=Integer.MIN_VALUE;

        //starting from 1 because I am interested in future.
        for(int i=1;i<prices.length;i++)
        {
            //I can buy Stock Today
            if(prices[i] < best_buy_price) best_buy_price=prices[i];

            //I will sell the stock only when my new profit > old profit
            if(prices[i] - best_buy_price > max_profit)
            {
                //I want to maximise this profit only. In order to make profit ,
                // buy at low cost is previous days
                // and sell it at higher (not equal) cost in today/nest days...
                max_profit=Math.max(max_profit,prices[i] - best_buy_price);

            }

        }
        //If max_profit is negetive that mean we never made any profit at all....
        return max_profit < 0 ? 0 : max_profit;
    }
    public static void main(String[] args) {
        int prices[]={2};
        System.out.println(MaxProfit(prices));
    }
}
