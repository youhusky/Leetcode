# 264. Ugly Number II

[Original Page](https://leetcode.com/problems/ugly-number-ii/)

Write a program to find the `n`-th ugly number.

Ugly numbers are positive numbers whose prime factors only include `2, 3, 5`. For example, `1, 2, 3, 4, 5, 6, 8, 9, 10, 12` is the sequence of the first `10` ugly numbers.

Note that `1` is typically treated as an ugly number.

**Hint:**

[Show Hint](#)

1.  The naive approach is to call `isUgly` for every number until you reach the n<sup>th</sup> one. Most numbers are _not_ ugly. Try to focus your effort on generating only the ugly ones.[Show More Hint](#)
2.  An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.[Show More Hint](#)
3.  The key is how to maintain the order of the ugly numbers. Try a similar approach of merging from three sorted lists: L<sub>1</sub>, L<sub>2</sub>, and L<sub>3</sub>.[Show More Hint](#)
4.  Assume you have U<sub>k</sub>, the k<sup>th</sup> ugly number. Then U<sub>k+1</sub> must be Min(L<sub>1</sub> * 2, L<sub>2</sub> * 3, L<sub>3</sub> * 5).

**Credits:**  
Special thanks to [@jianchao.li.fighter](https://leetcode.com/discuss/user/jianchao.li.fighter) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Dynamic Programming](/tag/dynamic-programming/) [Heap](/tag/heap/) [Math](/tag/math/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(H) Merge k Sorted Lists](/problems/merge-k-sorted-lists/) [(E) Count Primes](/problems/count-primes/) [(E) Ugly Number](/problems/ugly-number/) [(M) Perfect Squares](/problems/perfect-squares/) [(M) Super Ugly Number](/problems/super-ugly-number/)</span></div>