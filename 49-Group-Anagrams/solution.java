public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

    if (strs == null || strs.length == 0) {
        return res;
    } 

    Map<String, Integer> m = new HashMap<>();

    for (String str : strs) {
       
        String sortedStr = sortString(str);//判断相同
        
        if (m.containsKey(sortedStr)) {
            int index = m.get(sortedStr);
            res.get(index).add(str);
        } else {
            m.put(sortedStr, res.size());
            List<String> group = new ArrayList<>();
            group.add(str);
            res.add(group);
        }
    }

    return res;
}

private String sortString (String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}
}