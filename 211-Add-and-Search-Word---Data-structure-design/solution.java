public class WordDictionary {
    Map<Integer, List<String>> map = new HashMap<>();
    // Adds a word into the data structure.
    public void addWord(String word) {
        int index = word.length();
        if (!map.containsKey(index)){
            List<String> list = new ArrayList();
            list.add(word);
            map.put(index, list);
        }
        else{
            map.get(index).add(word);
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        int index = word.length();
        if (!map.containsKey(index)){
            return false;
        }
        List<String> list = map.get(index);
        for (String s : list){
            if (isSame(s, word)){
                return true;
            }
        }
        return false;
    }
    private boolean isSame(String s, String target){
        for (int i = 0; i < s.length(); i++){
            if (target.charAt(i)!='.' && s.charAt(i) != target.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");