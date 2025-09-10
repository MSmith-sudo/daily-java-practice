import java.util.*;

public class ReverseEachWord{
  private static String reverseWord(String w){
    StringBuilder sb = new StringBuilder(w);
    return sb.reverse().toString();
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String s = sc.nextLine();

    String[] parts = s.split("\\s+");

    for (int i = 0; i < parts.length; i++){
      parts[i] = reverseWord(parts[i]);
    }
    String result = String.join(" ", parts);
    System.out.println(result);

    sc.close();
  }
}
