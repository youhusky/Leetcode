public class Solution {
    public boolean isSelfCrossing(int[] x) {
        int l = x.length;
        if(l <= 3) return false;

        for(int i = 3; i < l; i++){
            if(x[i] >= x[i-2] && x[i-1] <= x[i-3]) return true;  //Fourth line crosses first line and onward
            if(i >=4)
            {
                if(x[i-1] == x[i-3] && x[i] + x[i-4] >= x[i-2]) return true; // Fifth line meets first line and onward
            }
            if(i >=5)
            {
                if(x[i-2] - x[i-4] >= 0 && x[i] >= x[i-2] - x[i-4] && x[i-1] >= x[i-3] - x[i-5] && x[i-1] <= x[i-3]) return true;  // Sixth line crosses first line and onward
            }
        }
        return false;
    }
}
// 实际上相交的情况只有以下三种情况：

//      x(1)
//     ┌───┐
// x(2)│   │x(0)
//     └───┼──>
//     x(3)│
        
// 第一类是第四条边和第一条边相交的情况，需要满足的条件是第一条边大于等于第三条边，第四条边大于等于第二条边。同样适用于第五条边和第二条边相交，第六条边和第三条边相交等等，依次向后类推的情况...

 

// 复制代码
//       x(1)
//     ┌──────┐
//     │      │x(0)
// x(2)│      ^
//     │      │x(4)
//     └──────│
//       x(3)
// 复制代码
// 第二类是第五条边和第一条边重合相交的情况，需要满足的条件是第二条边和第四条边相等，第五条边大于等于第三条边和第一条边的差值，同样适用于第六条边和第二条边重合相交的情况等等依次向后类推...

 

// 复制代码
//       x(1)
//     ┌──────┐
//     │      │x(0)
// x(2)│     <│────│
//     │       x(5)│x(4)
//     └───────────│
//         x(3)
// 复制代码
// 第三类是第六条边和第一条边相交的情况，需要满足的条件是第四条边大于等于第二条边，第三条边大于等于第五条边，第五条边大于等于第三条边和第一条边的差值，第六条边大于等于第四条边和第二条边的差值，同样适用于第七条边和第二条边相交的情况等等依次向后类推...

