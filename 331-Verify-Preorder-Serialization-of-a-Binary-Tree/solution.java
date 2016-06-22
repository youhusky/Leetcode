public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] s = preorder.split(",");
        Stack<String> stack = new Stack();
        for (String str : s){
            if(str.equals("#")){
            while(!stack.isEmpty() && stack.peek().equals("#")){
                stack.pop();
                if(!stack.isEmpty()) stack.pop();
                else return false;
            }
            stack.push("#");
        }else{
            stack.push(str);
            }
        }
        return stack.peek()=="#"&& stack.size()==1;
    }
}