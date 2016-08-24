心路历程：

这题卡住了，明显是递归，但是递归的接口不容易弄好，主要是返回值不好确定：
最开始试过public int helper(start, end)，然而这个返回值int不明确，因为start到end会有多个表达式值，一个int不好使，遂作罢
然后试了public void helper(start, end, resultList),这个是想traverse，仔细一想也是不行，遂作罢
遂看别人题解，发现网上所有的题解惊人的相似，他们的递归接口就是leetcode给的接口，并没有自己再写：
List<Integer> helper(String input),这个接口很好地解决了我第一个尝试的问题，一个Int不好使，就搞个list of int，所以这个接口的意思是：
输入为string，返回这个string的不同组合后的表达式值，返回在List里。而且他没有用start和end，那就是要用substring了，无伤大雅。

解题思路是：
对于当前表达式，对每一个操作符，将其左边的表达式组合一下搞一个list出来，将其右边的表达式组合一下搞一个List出来，用当前操作符把两个List搞一下，返回一个新的list去，代表当前表达式的所有表达式组合可取值。

注意
返回的是List，不是int