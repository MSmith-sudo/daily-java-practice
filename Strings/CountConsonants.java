import java.util.Scanner;

public class CountConsonants{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your word here please: ");
    String word = sc.nextLine().toLowerCase();
    int count = 0;
    for (int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      if (Character.isLetter(c) && (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')){
        count++;
      }
    }

    System.out.println("The number of constants that occured in your word is:" + count + ".");

    sc.close();
  }
}