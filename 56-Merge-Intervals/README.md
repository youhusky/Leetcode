思路：先排序，然后检查相邻两个区间，看前一个区间的结尾是否大于后一个区间的开始，注意前一个区间包含后一个区间的情况。

用Java自带的sort()方法，只要自己重写compare()方法即可。