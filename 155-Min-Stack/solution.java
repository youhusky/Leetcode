public class MinStack {

    /** initialize your data structure here. */
    // -2   0   -3  //max,-2,0,-2,-3 ->
    
    int min=Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    
    
    public void push(int x) {
        if (x<=min){
            stack.push(min);// save min
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        int temp = stack.pop();
        if (temp == min){
            min = stack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */