import java.util.*;

public class ReverseWordOrder{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String s = sc.nextLine().trim();
    String[] parts = s.split("\\s+");

    for (int left = 0, right = parts.length - 1; left < right; left++, right--){
      String tmp = parts[left];
      parts[left] = parts[right];
      parts[right] = tmp;
    }
    String result = String.join(" ", parts);
    System.out.println(result);
    
    sc.close();
  }
}