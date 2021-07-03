package primary.array;

import java.util.Objects;

/**
 * 买卖股票的最佳时机
 * @author Amboo
 */
public class StocksInvestment {

    public static void main(String[] args){
        int[] price = new int[]{7,6,4,3,1};
        int maxProfit = maxProfit(price);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] > prices[i + 1]) {
                continue;
            }
            for (int j = i; j < prices.length -1; j++) {
                int k = j + 1;
                if (prices[j] < prices[k]) {
                    if(k == prices.length -1){
                        maxProfit += prices[k] - prices[i];
                        return maxProfit;
                    }
                    continue;
                }
                maxProfit += prices[j] - prices[i];
                i = k -1;
                break;
            }
        }
        return maxProfit;
    }

}
