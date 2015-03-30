class MinStack {
    
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    
    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty() || x<= minstack.peek()) minstack.push(x);
        
    }

    public void pop() {
        //use .equals() to compare object
        if(stack.pop().equals(minstack.peek())) minstack.pop();
        
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
