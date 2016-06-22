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
// //1.基本数据类型，也称原始数据类型。byte,short,char,int,long,float,double,boolean
// 他们之间的比较，应用双等号（==）,比较的是他们的值。
// 2.复合数据类型(类) 用euqals 比较的是值而不是内存空间
//
// 统计树的出度（out-degree）和入度（in-degree）
// String[] strs = preorder.split(",");
//     int degree = -1;         // root has no indegree, for compensate init with -1
//     for (String str: strs) {
//         degree++;             // all nodes have 1 indegree (root compensated)
//         if (degree > 0) {     // total degree should never exceeds 0
//             return false;
//         }      
//         if (!str.equals("#")) {// only non-leaf node has 2 outdegree
//             degree -= 2;
//         }  
//     }
//     return degree == 0;