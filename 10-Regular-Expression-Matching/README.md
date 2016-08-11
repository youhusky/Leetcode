思路
这道题可以用递归解决，不过时间复杂度是指数级，这里介绍一个用动态规划在平方时间内解决的办法。
解法的核心理念是：从后往前看pattern的每一位，对于pattern的每一位，我们尽可能的把待匹配串string从后往前给匹配上。我们用一个数组match[string.length() + 1]来表示string被匹配的情况，这里如果match[j]是true，而我们pattern正指向第i位，则说明string从第j位到最后都已经被pattern第i位之前的某些部分给成功匹配了，所以我们不用再操心了。match[i]为true的条件是match[i + 1]为true，且string第i个字符也能被成功匹配。

那我们就可以从后往前开始看pattern的每一位能匹配多少string的字符了：

如果pattern的这一位是*，那我们要用这一位，来从后往前尝试匹配string，因为string后面是已经匹配好的，前面是还没匹配好的，所以从前往后匹配星号可能会导致我们匹配了一些pattern该星号前面的星号应该匹配的部分。而从后往前匹配则不会影响pattern该星号后面星号所匹配的部分，因为已经匹配的部分我们会直接跳过。
如果pattern这一位不是*，那我们则不能匹配多个字符，我们只能匹配一个字符，这时候要对string从前往后匹配，因为如果后面没被匹配，前面也肯定不会被匹配，所以从前向后能保证我们把pattern的这一位匹配到string当前最后面那个还没匹配的字符。这样如果那个字符能被匹配就通过了。
我们举个例子

match:   0 0 0 1
string:  a a b
pattern: a * b
             |
这里我们先看pattern最后一位b能匹配到多少，这里因为b不是星号，所以我们从左往右尝试匹配string，第一个a不行，第二个a也不行，然后到b，这里因为match[3]是true，b也和b相同，所以匹配成功。

match:   0 0 1 1
string:  a a b
pattern: a * b
           |
然后看pattern的这个星号，我们要从后往前匹配string。因为b已经被匹配了，match[2]是true，所以直接跳过。然后到a，发现个pattern中星号前面的字符a相同，所以匹配成功，match[1]也置为true再看string的第一个a，还是可以匹配成功，这样整个string都被匹配成功了。

这里还有几个情况，首先，无论刚才那pattern中最后一个b有没有匹配到string中任何一个字符，match[3]也要置为false。这样才能防止pattern最后字母没有匹配上，而pattern前面的部分反而把string的结尾给匹配了。还有如果pattern中是句号的话，那相当于字符相同。

