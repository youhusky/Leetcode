直观的想法是，找到比较两个字符串（版本号）的方法，举个例子，1.1.2和1.2.3的比较，那么先比较第一位，两个1相等。那么就再看第二位，1<2，得出结果。
根据这个思路，先把字符串拆分成字符串数组，然后逐个比较即可。