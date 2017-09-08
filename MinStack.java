class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(x <= min){
            stack.push(min);    //keep old min val
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min){
            min = stack.pop();   // revert min to previous one
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}