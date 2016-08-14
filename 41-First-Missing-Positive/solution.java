public class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap();
        for (int a: nums){
            if (a>0){
                map.put(a,true);
            }
        }
        int v = 1;
        while(true){
            if(!map.containsKey(v)){
                break;
            }
            v++;
        }
    return v;
    }
}