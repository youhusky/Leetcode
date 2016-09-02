If all rectangles can form an exact rectangular area, they should follow these conditions:

The sum of area of all small rectangles should equal to the area of large rectangle.
At any position except outer four corners, the amount of overlapping corners should be even (2, 4).
Corners that overlap at the same point should be different type (top-left, top-right, bottom-left, bottom-right).
So, I used

Four int variables to record the boundaries of large rectangle and then calculate the area.
A hashmap that maps corner with its type.
Four numbers (1, 2, 4, 8) to represent four types of corner. Then use bit manipulation to modify and check.
O(n) time complexity, O(n) space, 112 ms run time.
Special credit to @wu474purdue-edu