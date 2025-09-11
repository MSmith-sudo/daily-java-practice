import java.util.*;

public class Factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n = sc.nextInt();
    int result = 1;
    for (int i = 1; i <= n; i++){
      result *= i;
    }
    System.out.println("The factorial of " + n + " is " + result);
    sc.close();
  }
}n