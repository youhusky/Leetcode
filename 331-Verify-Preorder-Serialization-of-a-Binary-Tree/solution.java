public class Solution {
    public boolean isValidSerialization(String preorder) {
    String[]a = preorder.split(",");

    Stack<String> stack = new Stack<String>();
    for(int i = 0; i<a.length; i++){
        String cur = a[i];
        if(cur.equals("#")){
            while(!stack.isEmpty() && stack.peek().equals("#")){
                stack.pop();
                if(!stack.isEmpty()) stack.pop();
                else return false;
            }
            stack.push("#");
        }else{
            stack.push(cur);
        }
    }
    return stack.size()==1 && stack.peek().equals("#");
}
}