/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0)
        return 0;
    if (points.length <= 2)
        return points.length;
    int max = 0;
    for (int i = 0; i < points.length; i++) {
        HashMap<Double, Integer> map = new HashMap<>();
        int samePoint = 0, sameX = 1;
        for (int j = 0; j < points.length; j++) {
            if (i == j)
                continue;
            if (points[j].x == points[i].x && points[j].y == points[i].y)
                samePoint++;
            if (points[j].x == points[i].x) {
                sameX++;
                continue;
            }
            double k = (double) (points[j].y - points[i].y) / (double) (points[j].x - points[i].x);
            if (map.get(k) == null)
                map.put(k, 2);
            else
                map.put(k, map.get(k) + 1);
        }

        for (Double k : map.keySet()) {
            max = Integer.max(max, map.get(k) + samePoint);
        }
        max = Integer.max(max, sameX);
    }
    return max;
    }
}