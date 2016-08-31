public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for (int i = 0; i < magazine.length(); i++) cnt[magazine.charAt(i) - 97]++;
		for (int i = 0; i < ransomNote.length(); i++) if (--cnt[ransomNote.charAt(i) - 97] < 0) return false;
		return true;
    }
}