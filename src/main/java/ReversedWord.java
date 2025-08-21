import java.util.Scanner;

public class ReversedWord{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a word");
    String word = sc.nextLine();
    char[] array = word.toCharArray();
    int left = 0;
    int right = array.length - 1;

    while (left < right){
      char temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }
    String reversedWord = new String(array);
    System.out.println("The reversed word from the array is: " + reversedWord + ".");
    sc.close();
  }
}