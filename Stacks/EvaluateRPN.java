import java.util.*;

  public class EvaluateRPN {
    private static int evalRPN(String[] tokens) {
      Deque<Integer> stack = new ArrayDeque<>();

      for (String token : tokens) {
      
        if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
          int b = stack.pop();
          int a = stack.pop();
          switch (token) {
            case "+":
              stack.push(a + b);
              break;
            case "-":
              stack.push(a - b);
              break;
            case "*":
              stack.push(a * b);
              break;
            case "/":
              stack.push(a / b);
              break;
          }
        } else {
          
          stack.push(Integer.parseInt(token));
        }
      }

      return stack.pop();
    }

    public static void main(String[] args) {
      String[] tokens = {"2", "1", "+", "3", "*"};
      System.out.println("Result: " + evalRPN(tokens));
    }
  }
