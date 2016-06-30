# 318. Maximum Product of Word Lengths

[Original Page](https://leetcode.com/problems/maximum-product-of-word-lengths/)

Given a string array `words`, find the maximum value of `length(word[i]) * length(word[j])` where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

**Example 1:**  

Given `["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]`  
Return `16`  
The two words can be `"abcw", "xtfn"`.

**Example 2:**  

Given `["a", "ab", "abc", "d", "cd", "bcd", "abcd"]`  
Return `4`  
The two words can be `"ab", "cd"`.

**Example 3:**  

Given `["a", "aa", "aaa", "aaaa"]`  
Return `0`  
No such pair of words.

**Credits:**  
Special thanks to [@dietpepsi](https://leetcode.com/discuss/user/dietpepsi) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Bit Manipulation](/tag/bit-manipulation/)</span></div>