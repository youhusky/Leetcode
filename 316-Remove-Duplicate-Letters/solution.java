public class Solution {
    public String removeDuplicateLetters(String s) {
        int[] res = new int[26]; //will contain number of occurences of character (i+'a')
        boolean[] visited = new boolean[26]; //will contain if character (i+'a') is present in current result Stack
        char[] ch = s.toCharArray();
        for(char c: ch){  //count number of occurences of character 
            res[c-'a']++;
        }
        Stack<Character> st = new Stack<>(); // answer stack
        int index;
        for(char each:ch){ 
            index= each-'a';
            res[index]--;   //decrement number of characters remaining in the string to be analysed
            if(st.search(each)!=-1) //if character is already present in stack, dont bother
                continue;
            //if current character is smaller than last character in stack which occurs later in the string again
            //it can be removed and  added later e.g stack = bc remaining string abc then a can pop b and then c
            while(!st.isEmpty() && each<st.peek() && res[st.peek()-'a']!=0){ 
                st.pop();
                //visited[st.pop()-'a']=false;
            }

            st.push(each); //add current character and mark it as visited
        }
    
        StringBuilder sb = new StringBuilder();
        //pop character from stack and build answer string from back
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}