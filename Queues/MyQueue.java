import java.util.*;

public class MyQueue {
  private Deque<Integer> in = new ArrayDeque<>();
  private Deque<Integer> out = new ArrayDeque<>();

  public void push(int x) {
    in.push(x); 
  }

  public int pop() {
    ensureOut();
    return out.pop(); 
  }

  public int peek() {
    ensureOut();
    return out.peek(); 
  }

  public boolean empty() {
    return in.isEmpty() && out.isEmpty();
  }

  private void ensureOut() {
    if (out.isEmpty()) {
      while (!in.isEmpty()) {
        out.push(in.pop());
      }
    }
  }

  public static void main(String[] args) {
    MyQueue q = new MyQueue();
    q.push(1);
    q.push(2);
    q.push(3);
    System.out.println(q.peek());  
    System.out.println(q.pop());   
    System.out.println(q.pop());   
    System.out.println(q.empty()); 
  }
}
