我们根据区间起始位置（就是start）作为BST 的key，对于要添加的数val，查找其左右区间。。  ceil 满足 val < key , floor 满足 key <= val

然后判断其范围进行合并。 感觉没啥好说的。。