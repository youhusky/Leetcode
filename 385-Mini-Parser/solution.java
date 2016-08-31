/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
       public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') return new NestedInteger(Integer.parseInt(s));
        NestedInteger ans = new NestedInteger();
        int prev = 1;
        for (int i = 1, cnt = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) == '[') {
                cnt++;
            } else if (s.charAt(i) == ']') {
                cnt--;
            } else if (s.charAt(i) == ',' && cnt == 0) {
                ans.add(deserialize(s.substring(prev, i)));
                prev = i + 1;
            }
        }
        if (prev < s.length() - 1) // not '[]'
            ans.add(deserialize(s.substring(prev, s.length() - 1)));
        return ans;
    }
}