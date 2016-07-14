/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ans = new ArrayList<Interval>();  
          
        // insert newInterval by binary searching  
        int l = 0;  
        int r = intervals.size() - 1;  
        while (l <= r) {  
            int mid = (l + r) >> 1;  
            if (intervals.get(mid).start > newInterval.start) {  
                r = mid - 1;  
            } else {  
                l = mid + 1;  
            }  
        }  
        intervals.add(l, newInterval);  
          
        // merge all overlapping intervals  
        int start = intervals.get(0).start;  
        int end = intervals.get(0).end;  
        for (int i = 1; i < intervals.size(); i++) {  
            Interval inter = intervals.get(i);  
            if (inter.start > end) {  
                ans.add(new Interval(start, end));  
                start = inter.start;  
                end = inter.end;  
            } else {  
                end = Math.max(end, inter.end);  
            }  
        }  
        ans.add(new Interval(start, end));  
          
        return ans;  
    }
}