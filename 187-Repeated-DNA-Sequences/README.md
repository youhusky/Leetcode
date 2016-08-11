这一题经典的用二进制序列表示字符串序列，以减少内存消耗的例子。

题目中提到DNA序列只包含四种碱基对，分别用A，C，G和T表示，那么就可以用二进制数来分别代表它们：

A：00
C：01
G：10
T：11
那么形如ACGT的DNA序列就可以表示为00011011，也就是27。而且这个值对于所有DNA序列都是唯一的，那么就可以把它作为key，出现的次数作为value，将已出现过的key都放入哈希表中即可。
