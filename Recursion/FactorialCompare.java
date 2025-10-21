public class FactorialCompare{
  private static int factorial(int n){
    if(n <= 1) return 1;
    return n * factorial(n - 1);
  }

  private static int factorialIterative(int n){
    int result = 1;
    for(int i = 1; i <= n; i++) result *= i;
    return result;
  }

  public static void main(String[] args){
    int n = 5;
    System.out.println(factorial(n));
    System.out.println(factorialIterative(n));
  }
}