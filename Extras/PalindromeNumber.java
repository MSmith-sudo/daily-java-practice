import java.util.*;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter in your desired number: ");
    int num = sc.nextInt();
    int originalNum = num;
    int reversedNum = 0;

    while (num != 0) {
      int digit = num % 10;
      reversedNum = reversedNum * 10 + digit;
      num /= 10;
    }

    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is a palindrome.");
    } else {
      System.out.println(originalNum + " is not a palindrome.");
    }

    sc.close();
  }
}
