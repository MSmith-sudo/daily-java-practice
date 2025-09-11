import java.util.*;

public class GCD{
 private static int gcdRecursive(int a, int b){
   if (b == 0) return a;
   return gcdRecursive(b, a % b);
 }

  private static int gcdIterative(int a, int b){
    while (b != 0){
      int tmp = b;
      b = a % b;
      a = tmp;
    }
    return a;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("GCD Recursive: " + gcdRecursive(a, b));
    System.out.println("GCD Iterative: " + gcdIterative(a, b));

    sc.close();
  }
}