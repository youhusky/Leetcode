public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        //BFS to solve the problem
        int count = 1;
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        wordList.add(endWord);
        
        while (!reached.contains(endWord)) {
            Set<String> toAdd = new HashSet<String>();
            for (String word : reached) {
                
                for (int i = 0; i < word.length(); i++) {
                    char[] chars = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String newWord = String.valueOf(chars);
                        if (wordList.contains(newWord)) {
                            toAdd.add(newWord);
                            wordList.remove(newWord);
                        }
                    }
                }
            }
            count++;
            if (toAdd.size() == 0) return 0;
            reached = toAdd;
        }
        return count;
    }
}