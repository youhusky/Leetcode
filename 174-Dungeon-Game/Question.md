# 174. Dungeon Game

[Original Page](https://leetcode.com/problems/dungeon-game/)

<style>table.dungeon, .dungeon th, .dungeon td { border:3px solid black; } .dungeon th, .dungeon td { text-align: center; height: 70px; width: 70px; }</style>

The demons had captured the princess (**P**) and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (**K**) was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

Some of the rooms are guarded by demons, so the knight loses health (_negative_ integers) upon entering these rooms; other rooms are either empty (_0's_) or contain magic orbs that increase the knight's health (_positive_ integers).

In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.

**Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.**

For example, given the dungeon below, the initial health of the knight must be at least **7** if he follows the optimal path `RIGHT-> RIGHT -> DOWN -> DOWN`.

<table class="dungeon">

<tbody>

<tr>

<td>-2 (K)</td>

<td>-3</td>

<td>3</td>

</tr>

<tr>

<td>-5</td>

<td>-10</td>

<td>1</td>

</tr>

<tr>

<td>10</td>

<td>30</td>

<td>-5 (P)</td>

</tr>

</tbody>

</table>

**Notes:**

*   The knight's health has no upper bound.
*   Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.

**Credits:**  
Special thanks to [@stellari](https://oj.leetcode.com/discuss/user/stellari) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="company_tags" class="btn btn-xs btn-warning">Show Company Tags</div>

<span class="hidebutton">[Microsoft](/company/microsoft/)</span></div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Binary Search](/tag/binary-search/) [Dynamic Programming](/tag/dynamic-programming/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(M) Unique Paths](/problems/unique-paths/) [(M) Minimum Path Sum](/problems/minimum-path-sum/)</span></div>