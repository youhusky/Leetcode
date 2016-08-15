public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new LinkedList<Integer>();
        if(words == null || words.length == 0 || s == null || s.equals("")) return res;
        HashMap<String, Integer> freq = new HashMap<String, Integer>();
        // 统计数组中每个词出现的次数，放入哈希表中待用
        for(String word : words){
            freq.put(word, freq.containsKey(word) ? freq.get(word) + 1 : 1);
        }
        // 得到每个词的长度
        int len = words[0].length();
        // 错开位来统计
        for(int i = 0; i < len; i++){
            // 建一个新的哈希表，记录本轮搜索中窗口内单词出现次数
            HashMap<String, Integer> currFreq = new HashMap<String, Integer>();
            // start是窗口的开始，count表明窗口内有多少词
            int start = i, count = 0;
            for(int j = i; j <= s.length() - len; j += len){
                String sub = s.substring(j, j + len);
                // 看下一个词是否是给定数组中的
                if(freq.containsKey(sub)){
                    // 窗口中单词出现次数加1
                    currFreq.put(sub, currFreq.containsKey(sub) ? currFreq.get(sub) + 1 : 1);
                    count++;
                    // 如果该单词出现次数已经超过给定数组中的次数了，说明多来了一个该单词，所以要把窗口中该单词上次出现的位置及之前所有单词给去掉
                    while(currFreq.get(sub) > freq.get(sub)){
                        String leftMost = s.substring(start, start + len);
                        currFreq.put(leftMost, currFreq.get(leftMost) - 1);
                        start = start + len;
                        count--;
                    }
                    // 如果窗口内单词数和总单词数一样，则找到结果
                    if(count == words.length){
                        String leftMost = s.substring(start, start + len);
                        currFreq.put(leftMost, currFreq.get(leftMost) - 1);
                        res.add(start);
                        start = start + len;
                        count--;
                    }
                // 如果截出来的单词都不在数组中，前功尽弃，重新开始
                } else {
                    currFreq.clear();
                    start = j + len;
                    count = 0;
                }
            }
        }
        return res;
    }
}
