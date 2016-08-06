public class Solution {
    public int compareVersion(String version1, String version2) {
        //拆分两个字符串
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length, l2 = v2.length;
        int len = Math.max(l1,l2);
        //这里用最大的长度作为循环范围
        for(int i = 0; i < len; i++){
            //因为循环范围是最大长度，所以缺的位置补0
            int cur1 = i < l1 ? Integer.valueOf(v1[i]) : 0;
            int cur2 = i < l2 ? Integer.valueOf(v2[i]) : 0;
            if(cur1 < cur2) return -1;
            else if(cur1 > cur2) return 1;
        }
        return 0;
    }
}