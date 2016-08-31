思路和Combination Sum II一样，用DFS递归求解。
加一个参数count = k，count每当有新的数i加入计算集合cur则减一；同时，target，也就是给定的n，也要减少i。
当count为0时，集合里就有k个数了。此时，若target也正好减小为0，说明当前集合pre是正解，pre加入res数组。

两个无法得到正解的情况是：
在count为0，而target不为0时，当然已经无法得到正解，return。
在count不为0而target却已经小于等于0的情况下，此时仍要加入其它数以令count为0，而要加入的数都是1到9的正整数，所以已无法满足令target为0的条件，return。