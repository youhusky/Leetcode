/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class SummaryRanges {

    TreeMap<Integer, Interval> map;

    public SummaryRanges() {
        map = new TreeMap<Integer, Interval>();
    }

    public void addNum(int val) {
        Integer ceil = map.higherKey(val); // val < key
        Integer floor = map.floorKey(val); // key <= val
        if (floor != null && map.get(floor).end + 1 >= val) {
            if (ceil != null && ceil == val + 1) {
                map.get(floor).end = map.get(ceil).end;
                map.remove(ceil);
            } else
                map.get(floor).end = Math.max(map.get(floor).end, val);
        } else if (ceil != null && ceil == val + 1) {
            map.put(val, new Interval(val, map.get(ceil).end));
            map.remove(ceil);
        } else
            map.put(val, new Interval(val, val));
    }

    public List<Interval> getIntervals() {
        return new ArrayList<>(map.values());
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(val);
 * List<Interval> param_2 = obj.getIntervals();
 */