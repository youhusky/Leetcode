首先为每一个孩子分配1个糖果

记当前孩子序号为i，糖果数为candies[i]，评分为ratings[i]

2. 从左向右遍历，若ratings[i] > ratings[i - 1]，则令candies[i] = candies[i - 1] + 1

3. 从右向左遍历，若ratings[x] > ratings[x + 1]，则令candies[x] = max(candies[x], candies[x + 1] + 1)