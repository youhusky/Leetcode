class TrieNode {
    // Initialize your data structure here.
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf = false;
    char c;
    public TrieNode(){}
    public TrieNode(char c) {
        this.c = c;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;
        for(int i = 0; i < word.length(); i++){
            TrieNode next;
            // 如果已有该字母的节点，则转向该节点
            if(children.containsKey(word.charAt(i))){
                next = children.get(word.charAt(i));
            } else {
            // 如果没有该字母的节点，就新建一个节点
                next = new TrieNode(word.charAt(i));
                children.put(word.charAt(i), next);
            }
            children = next.children;
            if(i == word.length() - 1){
                next.isLeaf = true;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode res = searchNode(word);
        if(res != null && res.isLeaf){
            return true;
        } else {
            return false;
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }
    
    private TrieNode searchNode(String word){
        HashMap<Character, TrieNode> children = root.children;
        TrieNode next = null;
        for(int i = 0; i < word.length(); i++){
            if(children.containsKey(word.charAt(i))){
                next = children.get(word.charAt(i));
                children = next.children;
            } else {
                return null;
            }
        }
        return next;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
