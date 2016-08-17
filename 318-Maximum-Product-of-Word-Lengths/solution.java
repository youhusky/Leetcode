public class Solution {
    public int maxProduct(String[] words) {
        int[] maps = new int[words.length];
        
        // 将单词按照长度从长到短排序
        Arrays.sort(words, new Comparator<String>() {
           public int compare(String s1, String s2) {
               return s2.length() - s1.length();
           } 
        });
        
        // 对于每个单词，算出其对应的int来表示所含字母情况
        for (int i = 0; i < words.length; i++) {
            int bits = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                // 注意bit运算优先级
                bits = bits | (1 << (c - 'a'));
            }
            maps[i] = bits;
        }
        
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            // 提前结束，没必要继续loop
            if (words[i].length() * words[i].length() <= max)
                break;
            for (int j = i + 1; j < words.length; j++) {
                if ((maps[i] & maps[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                    // 下面的结果只会更小，没必要继续loop
                    break;
                }
            }
        }
        return max;
    }
}