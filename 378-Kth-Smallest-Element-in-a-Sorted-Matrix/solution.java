public class Solution {
    public class Point {
        int val;
        int row;
        int col;
        public Point(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length == 0) return 0;
        PriorityQueue<Point> pq = new PriorityQueue<Point>(new Comparator<Point>(){
           @Override
           public int compare(Point a, Point b) {
               return a.val - b.val;
           }
        });
        pq.offer(new Point(matrix[0][0], 0, 0));
        for(int i = 1; i < k; i++) {
            
            Point p = pq.poll();
            System.out.println(p.val);
            if((p.row+1) < matrix.length) {
                pq.offer(new Point(matrix[p.row+1][p.col], p.row+1, p.col));
            }
            if(p.row == 0 && (p.col+1) < matrix.length) {
                pq.offer(new Point(matrix[p.row][p.col+1], p.row, p.col+1));
            }
        }
        return pq.poll().val;
    }
}