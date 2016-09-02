public class Solution {
    Map<String, Integer> map = new HashMap<String, Integer>();
    public boolean isRectangleCover(int[][] rectangles) {
        if (rectangles.length == 0 || rectangles[0].length == 0) return false;
        int lx = Integer.MAX_VALUE, ly = lx, rx = Integer.MIN_VALUE, ry = rx, sum = 0;
        for (int[] rec : rectangles) {
            lx = Math.min(lx, rec[0]);
            ly = Math.min(ly, rec[1]);
            rx = Math.max(rx, rec[2]);
            ry = Math.max(ry, rec[3]);
            sum += (rec[2] - rec[0]) * (rec[3] - rec[1]);
            //bottom-left
            if (overlap(rec[0] + " " + rec[1], 1)) return false;
            //top-left
            if (overlap(rec[0] + " " + rec[3], 2)) return false;
            //bottom-right
            if (overlap(rec[2] + " " + rec[1], 4)) return false;
            //top-right
            if (overlap(rec[2] + " " + rec[3], 8)) return false;
        }
        int count = 0;
        Iterator<Integer> iter = map.values().iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (i != 15 && i != 12 && i != 10 && i != 9 && i != 6 && i != 5 && i != 3) count++;
        }
        return count == 4 && sum == (rx - lx) * (ry - ly);
    }
    
    private boolean overlap(String corner, Integer type) {
        Integer temp = map.get(corner);
        if (temp == null) temp = type;
        else if ((temp & type) != 0) return true;
        else temp |= type;
        map.put(corner, temp);
        return false;
    }
}