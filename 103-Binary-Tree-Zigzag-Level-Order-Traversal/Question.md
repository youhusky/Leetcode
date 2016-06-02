# 103. Binary Tree Zigzag Level Order Traversal

[Original Page](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

Given a binary tree, return the _zigzag level order_ traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:  
Given binary tree `{3,9,20,#,#,15,7}`,  

<pre>    3
   / \
  9  20
    /  \
   15   7
</pre>

return its zigzag level order traversal as:  

<pre>[
  [3],
  [20,9],
  [15,7]
]
</pre>

confused what `"{1,#,2,3}"` means? [> read more on how binary tree is serialized on OJ.](#)

<div class="spoilers" style="display: none;">  
**OJ's Binary Tree Serialization:**

The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

Here's an example:  

<pre>   1
  / \
 2   3
    /
   4
    \
     5
</pre>

The above binary tree is serialized as `"{1,2,3,#,#,4,#,#,5}"`.</div>

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="company_tags" class="btn btn-xs btn-warning">Show Company Tags</div>

<span class="hidebutton">[Bloomberg](/company/bloomberg/) [LinkedIn](/company/linkedin/) [Microsoft](/company/microsoft/)</span></div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Tree](/tag/tree/) [Breadth-first Search](/tag/breadth-first-search/) [Stack](/tag/stack/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(E) Binary Tree Level Order Traversal](/problems/binary-tree-level-order-traversal/)</span></div>