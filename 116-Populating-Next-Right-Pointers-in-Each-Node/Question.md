# 116. Populating Next Right Pointers in Each Node

[Original Page](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)

Given a binary tree

<pre>    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
</pre>

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.

**Note:**

*   You may only use constant extra space.
*   You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).

For example,  
Given the following perfect binary tree,  

<pre>         1
       /  \
      2    3
     / \  / \
    4  5  6  7
</pre>

After calling your function, the tree should look like:  

<pre>         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
</pre>

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Tree](/tag/tree/) [Depth-first Search](/tag/depth-first-search/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(H) Populating Next Right Pointers in Each Node II](/problems/populating-next-right-pointers-in-each-node-ii/) [(M) Binary Tree Right Side View](/problems/binary-tree-right-side-view/)</span></div>