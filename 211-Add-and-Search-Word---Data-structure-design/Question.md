# 211. Add and Search Word - Data structure design

[Original Page](https://leetcode.com/problems/add-and-search-word-data-structure-design/)

Design a data structure that supports the following two operations:

<pre>void addWord(word)
bool search(word)
</pre>

search(word) can search a literal word or a regular expression string containing only letters `a-z` or `.`. A `.` means it can represent any one letter.

For example:

<pre>addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true
</pre>

**Note:**  
You may assume that all words are consist of lowercase letters `a-z`.

[click to show hint.](#)

<div class="spoilers" style="display: none;">You should be familiar with how a Trie works. If not, please work on this problem: [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) first.</div>

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Backtracking](/tag/backtracking/) [Trie](/tag/trie/) [Design](/tag/design/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(M) Implement Trie (Prefix Tree)](/problems/implement-trie-prefix-tree/)</span></div>