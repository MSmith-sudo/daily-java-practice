import java.util.*;

public class MinStack {
    private Deque<Integer> data = new ArrayDeque<>();
    private Deque<Integer> mins  = new ArrayDeque<>();

    public void push(int x) {
        data.push(x);
        if (mins.isEmpty() || x <= mins.peek()) {
            mins.push(x);
        }
    }

    public void pop() {
        int popped = data.pop();
        if (!mins.isEmpty() && popped == mins.peek()) {
            mins.pop();
        }
    }

    public int top() {
        return data.peek(); 
    }

    public int getMin() {
        return mins.peek(); 
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); 
        minStack.pop();
        System.out.println(minStack.top());    
        System.out.println(minStack.getMin()); 
    }
}
