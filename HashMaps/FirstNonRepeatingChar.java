import java.util.*;

public class FirstNonRepeatingChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a word: ");
    String word = sc.nextLine().toLowerCase();

    Map<Character, Integer> freq = new HashMap<>();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (freq.get(c) == 1) {
        System.out.println("The first non-repeating character is: " + c);
        sc.close();
        return;
      }
    }
    System.out.println("No non-repeating character found.");
    sc.close();
  }
}
