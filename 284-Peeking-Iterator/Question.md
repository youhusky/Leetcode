# 284. Peeking Iterator

[Original Page](https://leetcode.com/problems/peeking-iterator/)

Given an Iterator class interface with methods: `next()` and `hasNext()`, design and implement a PeekingIterator that support the `peek()` operation -- it essentially peek() at the element that will be returned by the next call to next().

* * *

Here is an example. Assume that the iterator is initialized to the beginning of the list: `[1, 2, 3]`.

Call `next()` gets you 1, the first element in the list.

Now you call `peek()` and it returns 2, the next element. Calling `next()` after that _**still**_ return 2.

You call `next()` the final time and it returns 3, the last element. Calling `hasNext()` after that should return false.

**Hint:**

[Show Hint](#)

1.  Think of "looking ahead". You want to cache the next element.[Show More Hint](#)
2.  Is one variable sufficient? Why or why not?[Show More Hint](#)
3.  Test your design with call order of `peek()` before `next()` vs `next()` before `peek()`.[Show More Hint](#)
4.  For a clean implementation, check out [Google's guava library source code](https://github.com/google/guava/blob/703ef758b8621cfbab16814f01ddcc5324bdea33/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterators.java#L1125).

**Follow up**: How would you extend your design to be generic and work with all types, not just integer?

**Credits:**  
Special thanks to [@porker2008](https://leetcode.com/discuss/user/porker2008) for adding this problem and creating all test cases.

<div>

[Subscribe](/subscribe/) to see which companies asked this question

</div>

<div>

<div id="tags" class="btn btn-xs btn-warning">Show Tags</div>

<span class="hidebutton">[Design](/tag/design/)</span></div>

<div>

<div id="similar" class="btn btn-xs btn-warning">Show Similar Problems</div>

<span class="hidebutton">[(M) Binary Search Tree Iterator](/problems/binary-search-tree-iterator/) [(M) Flatten 2D Vector](/problems/flatten-2d-vector/) [(M) Zigzag Iterator](/problems/zigzag-iterator/)</span></div>