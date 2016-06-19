# 338. Counting Bits

[Original Page](https://leetcode.com/problems/counting-bits/)

Given a non negative integer number **num**. For every numbers **i** in the range **0 ≤ i ≤ num** calculate the number of 1's in their binary representation and return them as an array.

**Example:**  
For `num = 5` you should return `[0,1,1,2,1,2]`.

**Follow up:**

*   It is very easy to come up with a solution with run time **O(n*sizeof(integer))**. But can you do it in linear time **O(n)** /possibly in a single pass?
*   Space complexity should be **O(n)**.
*   Can you do it like a boss? Do it without using any builtin function like **__builtin_popcount** in c++ or in any other language.

**Hint:**

[Show Hint](#)

1.  You should make use of what you have produced already.[Show More Hint](#)
2.  Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.[Show More Hint](#)
3.  Or does the odd/even status of the number help you in calculating the number of 1s?

**Credits:**  
Special thanks to [@ syedee](https://leetcode.com/discuss/user/syedee) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Dynamic Programming](/tag/dynamic-programming/) [Bit Manipulation](/tag/bit-manipulation/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(E) Number of 1 Bits](/problems/number-of-1-bits/)</span></div>