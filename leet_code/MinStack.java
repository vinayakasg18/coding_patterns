package leet_code;

import java.util.Stack;

class MinStack {
    
    private Stack<int[]> stack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if (stack.isEmpty()){
            stack.push(new int[] {val, val});
            return;
        }
        
        int curMin = stack.peek()[1];
        stack.push(new int[]{val, Math.min(val, curMin)});
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        System.out.println(stack);
        return stack.peek()[0];
    }
    
    public int getMin() {
        System.out.println(stack);
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.getMin();
        obj.pop();
        System.out.println(obj.top());
        obj.getMin();
    }
}