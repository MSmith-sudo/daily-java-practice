import java.util.*;

public class ReverseInteger{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your desired number: ");
    int num = sc.nextInt();
    int reversedNum = 0;

    while (num != 0){
      int digit = num % 10;
      reversedNum = reversedNum * 10 + digit;
      num /= 10;
    }
    System.out.println("The reversed number is: " + reversedNum + ".");
    sc.close();
  }
}