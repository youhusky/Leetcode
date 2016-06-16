# 357. Count Numbers with Unique Digits

[Original Page](https://leetcode.com/problems/count-numbers-with-unique-digits/)

Given a **non-negative** integer n, count all numbers with unique digits, x, where 0 ≤ x < 10<sup>n</sup>.

**Example:**  
Given n = 2, return 91\. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding `[11,22,33,44,55,66,77,88,99]`)

**Hint:**

[Show Hint](#)

1.  A direct way is to use the backtracking approach.[Show More Hint](#)
2.  Backtracking should contains three states which are (the current number, number of steps to get that number and a bitmask which represent which number is marked as visited so far in the current number). Start with state (0,0,0) and count all valid number till we reach number of steps equals to 10<sup>n</sup>.[Show More Hint](#)
3.  This problem can also be solved using a dynamic programming approach and some knowledge of combinatorics.[Show More Hint](#)
4.  Let f(k) = count of numbers with unique digits with length equals k.[Show More Hint](#)
5.  f(1) = 10, ..., f(k) = 9 * 9 * 8 * ... (9 - k + 2) [The first factor is 9 because a number cannot start with 0].

**Credits:**  
Special thanks to [@memoryless](https://discuss.leetcode.com/user/memoryless) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="company_tags" class="btn btn-xs btn-warning">Show Company Tags</div>

<span class="hidebutton">[Google](/company/google/)</span></div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Dynamic Programming](/tag/dynamic-programming/) [Backtracking](/tag/backtracking/) [Math](/tag/math/)</span></div>