# 289. Game of Life

[Original Page](https://leetcode.com/problems/game-of-life/)

According to the [Wikipedia's article](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life): "The **Game of Life**, also known simply as **Life**, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a _board_ with _m_ by _n_ cells, each cell has an initial state _live_ (1) or _dead_ (0). Each cell interacts with its [eight neighbors](https://en.wikipedia.org/wiki/Moore_neighborhood) (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

1.  Any live cell with fewer than two live neighbors dies, as if caused by under-population.
2.  Any live cell with two or three live neighbors lives on to the next generation.
3.  Any live cell with more than three live neighbors dies, as if by over-population..
4.  Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

Write a function to compute the next state (after one update) of the board given its current state.

**Follow up**:  

1.  Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
2.  In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?

**Credits:**  
Special thanks to [@jianchao.li.fighter](https://leetcode.com/discuss/user/jianchao.li.fighter) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="company_tags" class="btn btn-xs btn-warning">Show Company Tags</div>

<span class="hidebutton">[Dropbox](/company/dropbox/) [Google](/company/google/) [Snapchat](/company/snapchat/)</span></div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Array](/tag/array/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(M) Set Matrix Zeroes](/problems/set-matrix-zeroes/)</span></div>