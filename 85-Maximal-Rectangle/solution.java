public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        if (m == 0 || (n == 0))
            return 0;

        int i, j, res = 0;
        int[] heights = new int[n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    heights[j] += 1;
                else
                    heights[j] = 0;
                }
            res = Math.max(res, largestRectangleArea(heights));
        }
      
        return res;
    }
    private int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0, largestArea = 0;
        while (index < height.length) {
            if (stack.isEmpty() || height[stack.peek()] < height[index]) {
                stack.push(index++);
            } else {
                int h = height[stack.pop()];
                int w = stack.isEmpty() ? index : index - stack.peek() - 1;
                largestArea = Math.max(largestArea, h * w);
            }
        }
        while (!stack.isEmpty()) {
            int h = height[stack.pop()];
            int w = stack.isEmpty() ? height.length : height.length - stack.peek() - 1;
            largestArea = Math.max(largestArea, h * w);
        }
        return largestArea;
    }
}