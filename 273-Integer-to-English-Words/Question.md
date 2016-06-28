# 273. Integer to English Words

[Original Page](https://leetcode.com/problems/integer-to-english-words/)

Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 2<sup>31</sup> - 1.

For example,  

<pre>123 -> "One Hundred Twenty Three"
12345 -> "Twelve Thousand Three Hundred Forty Five"
1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"</pre>

**Hint:**

[Show Hint](#)

1.  Did you see a pattern in dividing the number into chunk of words? For example, 123 and 123000.[Show More Hint](#)
2.  Group the number by thousands (3 digits). You can write a helper function that takes a number less than 1000 and convert just that chunk to words.[Show More Hint](#)
3.  There are many edge cases. What are some good test cases? Does your code work with input such as 0? Or 1000010? (middle chunk is zero and should not be printed out)

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Math](/tag/math/) [String](/tag/string/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(M) Integer to Roman](/problems/integer-to-roman/)</span></div>