public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices.length <2){
            return 0;
        }
        else if (k > prices.length /2){//II
            int max = 0;
            for (int i = 1; i< prices.length; i++){
                if(prices[i] > prices[i-1])
                    max += prices[i] - prices[i-1];
            }
            return max;
        }
        int[] local = new int[k+1];
        int[] global = new int[k+1];
            for (int day = 1; day < prices.length; day++){
                int diff = prices[day] - prices[day-1];
                for (int times = k; times>=1; times--){
                    local[times] = Math.max(global[times-1] + (diff>0?diff:0), local[times] + diff);// can purchase and sell on the same day
                    global[times] = Math.max(global[times],local[times]);
                }
            }
        
        return global[k];
    }
}

// 分析：特殊动态规划法。传统的动态规划我们会这样想，到第i天时进行j次交易的最大收益，要么等于到第i-1天时进行j次交易的最大收益（第i天价格低于第i-1天的价格），要么等于到第i-1天时进行j-1次交易，然后第i天进行一次交易（第i天价格高于第i-1天价格时）。于是得到动规方程如下（其中diff = prices[i] – prices[i – 1]）：

// profit[i][j] = max(profit[i – 1][j], profit[i – 1][j – 1] + diff)
// 看起来很有道理，但其实不对，为什么不对呢？因为diff是第i天和第i-1天的差额收益，如果第i-1天当天本身也有交易呢（也就是说第i-1天刚卖出了股票，然后又买入等到第i天再卖出），那么这两次交易就可以合为一次交易，这样profit[i – 1][j – 1] + diff实际上只进行了j-1次交易，而不是最多可以的j次，这样得到的最大收益就小了。

// 那么怎样计算第i天进行交易的情况的最大收益，才会避免少计算一次交易呢？我们用一个局部最优解和全局最有解表示到第i天进行j次的收益，这就是该动态规划的特殊之处。

// 用local[i][j]表示到达第i天时，最多进行j次交易的局部最优解；用global[i][j]表示到达第i天时，最多进行j次的全局最优解。它们二者的关系如下（其中diff = prices[i] – prices[i – 1]）：

// local[i][j] = max(global[i – 1][j – 1] , local[i – 1][j] + diff)
// global[i][j] = max(global[i – 1][j], local[i][j])
// local[i][j]和global[i][j]的区别是：local[i][j]意味着在第i天一定有交易（卖出）发生，当第i天的价格高于第i-1天（即diff > 0）时，那么可以把这次交易（第i-1天买入第i天卖出）跟第i-1天的交易（卖出）合并为一次交易，即local[i][j]=local[i-1][j]+diff；当第i天的价格不高于第i-1天（即diff<=0）时，那么local[i][j]=global[i-1][j-1]+diff，而由于diff<=0，所以可写成local[i][j]=global[i-1][j-1]。global[i][j]就是我们所求的前i天最多进行k次交易的最大收益，可分为两种情况：如果第i天没有交易（卖出），那么global[i][j]=global[i-1][j]；如果第i天有交易（卖出），那么global[i][j]=local[i][j]。