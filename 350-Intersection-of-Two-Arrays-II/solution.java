public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    for(int num : nums1) map.put(num,map.getOrDefault(num,0) + 1);
    
    for(int num : nums2){
        if(map.containsKey(num)){
            list.add(num);
            //nums1's size is small compared to num2's size
           if(map.get(num) == 1) map.remove(num);
           else map.put(num,map.get(num)-1);
        }
    }
    System.out.println(list);
    int[] res = new int[list.size()];
    for(int i = 0; i < list.size(); i++) res[i] = list.get(i);
    return res;
    }
}