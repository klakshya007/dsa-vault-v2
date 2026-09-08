class MinStack {
    Stack<Integer>minStack;
    Stack<Integer>currStack;
    public MinStack() {
        minStack=new Stack<>();
        currStack=new Stack<>();
    }
    
    public void push(int value) {
        currStack.push(value);
        if( minStack.isEmpty())minStack.push(value);
        else if (minStack.peek()>=value) minStack.push(value);
    }
    
    public void pop() {
        if(currStack.isEmpty() || minStack.isEmpty())return;
        if(currStack.peek().equals(minStack.peek()))minStack.pop();
        currStack.pop();
    }
    
    public int top() {
        return currStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */