public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new LinkedList<String>();
        HashMap<Character, Integer> tokenValueMap = new HashMap<Character, Integer>();
        tokenValueMap.put('A', 0);
        tokenValueMap.put('C', 1);
        tokenValueMap.put('G', 2);
        tokenValueMap.put('T', 3);
        HashMap<Integer, Integer> sequenceCountMap = new HashMap<Integer, Integer>();
        int length = s.length();
        for (int index = 0; index <= length - 10; index++) {
            int value = 0;
            for (int i = 0; i < 10; i++) {
                value <<= 2;
                value += tokenValueMap.get(s.charAt(index + i));
            }
            if (!sequenceCountMap.containsKey(value)) {
                sequenceCountMap.put(value, 1);
            } else if (sequenceCountMap.get(value) == 1) {
                sequenceCountMap.put(value, 2);
                result.add(s.substring(index, index + 10));
            }
        }
        return result;
    }
}