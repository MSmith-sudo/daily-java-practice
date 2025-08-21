import java.util.Scanner;

public class PalindromeCheck {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a word");
    String word = sc.nextLine().toLowerCase();

    String reversedWord = "";
    for (int i = word.length() - 1; i >= 0; i--){
      reversedWord += word.charAt(i);
    }
    System.out.println(reversedWord);

    if (word.equals(reversedWord)){
      System.out.println("The word is a palindrome");
    } else{
      System.out.println("The word is not a palindrome");
    }
    sc.close();
      }
}