public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
    	int m = dungeon.length;
    	int n = dungeon[0].length;
     
    	//init dp table
    	int[][] h = new int[m][n];
     
    	h[m - 1][n - 1] = Math.max(1 - dungeon[m - 1][n - 1], 1);
     
    	//init last row
    	for (int i = m - 2; i >= 0; i--) {
    		h[i][n - 1] = Math.max(h[i + 1][n - 1] - dungeon[i][n - 1], 1);
    	}
     
    	//init last column
    	for (int j = n - 2; j >= 0; j--) {
    		h[m - 1][j] = Math.max(h[m - 1][j + 1] - dungeon[m - 1][j], 1);
    	}
     
    	//calculate dp table
    	for (int i = m - 2; i >= 0; i--) {
    		for (int j = n - 2; j >= 0; j--) {
    			int down = Math.max(h[i + 1][j] - dungeon[i][j], 1);
    			int right = Math.max(h[i][j + 1] - dungeon[i][j], 1);
    			h[i][j] = Math.min(right, down);
    		}
    	}
     
    	return h[0][0];
    }
}
// 乍一看，这个问题和"Maximum/Minimum Path Sum"问题很相似。然而，具有全局最大HP（生命值）收益的路径并不一定可以保证最小的初始HP，因为题目中具有限制条件：HP不能≤0。例如，考虑下面的两条路径：0 -> -300 -> 310 -> 0 和 0 -> -1 -> 2 -> 0。这两条路径的净HP收益分别是-300 + 310 = 10 与 -1 + 2 = 1。第一条路径的净收益更高，但是它所需的初始HP至少是301，才能抵消第二个房间的-300HP损失，而第二条路径只需要初始HP为2就可以了。

// 幸运的是，这个问题可以通过“table-filling”（表格填充）动态规划算法解决，与其他"grid walking"（格子行走）问题类似：

// 首先，我们应该维护一个2维数组D，与地牢数组的大小相同，其中D[i][j]代表可以保证骑士在进入房间(i,j)之前，探索其余地牢时能够存活下来的最小HP。显然D[0][0]就是我们随后需要的最终答案。因此，对于这个问题，我们需要从右下角到左上角填充表格。

// 然后，我们来计算离开房间(i,j)时的最小HP。从这一点出发只有两条路径可选：(i + 1, j)和(i, j + 1)。当然我们会选择拥有更小D值的那个房间，换言之，骑士完成剩下的旅途所需的较小HP。因此我们有：

//   min_HP_on_exit = min(D[i+1][j], D[i][j+1])
  
// 现在D[i][j]可以通过dungeon[i][j]和min_HP_on_exit，根据下面的情景得出：

// 如果dungeon[i][j] == 0，那么在这个房间里很安全。 骑士离开这个房间时的HP和他进入房间时的HP保持一致， 也就是说 D[i][j] = min_HP_on_exit.

// 如果dungeon[i][j] < 0，那么骑士在进入该房间之前的HP > 离开房间时的HP，min_HP_on_exit才能抵消他在该房间中的HP损失。 最小HP花费就是 "-dungeon[i][j]"， 因此我们有公式 D[i][j] = min_HP_on_exit - dungeon[i][j].

// 如果dungeon[i][j] > 0, 那么骑士在进入房间(i, j) 时的HP只需为min_HP_on_exit - dungeon[i][j]，因为他可以在该房间内获得数值为"dungeon[i][j]"的HP收益。 不过，这种情况下min_HP_on_exit - dungeon[i][j]的数值可能≤0。 此时，我们需要把值置为1以确保D[i][j]为正整数: D[i][j] = max(min_HP_on_exit - dungeon[i][j], 1)。

// 注意 dungeon[i][j] > 0 条件下的等式实际上可以覆盖其他两种情况。 因此我们可以把三种情况归纳为同一个等式： 亦即:

// D[i][j] = max(min_HP_on_exit - dungeon[i][j], 1)
// dungeon[i][j]可以为任意值。

// D[0][0]就是最终答案。 此外，像许多其他"table-filling"问题一样，二维数组D可以用一维滚动数组替代。