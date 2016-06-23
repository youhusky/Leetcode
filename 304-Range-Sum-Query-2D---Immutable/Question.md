# 304. Range Sum Query 2D - Immutable

[Original Page](https://leetcode.com/problems/range-sum-query-2d-immutable/)

Given a 2D matrix _matrix_, find the sum of the elements inside the rectangle defined by its upper left corner (_row_1, _col_1) and lower right corner (_row_2, _col_2).

![Range Sum Query 2D](/static/images/courses/range_sum_query_2d.png)  
<small>The above rectangle (with the red border) is defined by (row1, col1) = **(2, 1)** and (row2, col2) = **(4, 3)**, which contains sum = **8**.</small>

**Example:**  

<pre>Given matrix = [
  [3, 0, 1, 4, 2],
  [5, 6, 3, 2, 1],
  [1, 2, 0, 1, 5],
  [4, 1, 0, 1, 7],
  [1, 0, 3, 0, 5]
]

sumRegion(2, 1, 4, 3) -> 8
sumRegion(1, 1, 2, 2) -> 11
sumRegion(1, 2, 2, 4) -> 12
</pre>

**Note:**  

1.  You may assume that the matrix does not change.
2.  There are many calls to _sumRegion_ function.
3.  You may assume that _row_1 ≤ _row_2 and _col_1 ≤ _col_2.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Dynamic Programming](/tag/dynamic-programming/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(E) Range Sum Query - Immutable](/problems/range-sum-query-immutable/) [(H) Range Sum Query 2D - Mutable](/problems/range-sum-query-2d-mutable/)</span></div>