import java.util.*;

public class AnagramCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your first word: ");
    String word1 = sc.nextLine().toLowerCase();

    System.out.print("Enter your second word: ");
    String word2 = sc.nextLine().toLowerCase();

    if (word1.length() != word2.length()) {
      System.out.println("The words are not anagrams.");
      sc.close();
      return;
    }

    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();

  
    for (int i = 0; i < word1.length(); i++) {
      char c1 = word1.charAt(i);
      char c2 = word2.charAt(i);

      map1.put(c1, map1.getOrDefault(c1, 0) + 1);
      map2.put(c2, map2.getOrDefault(c2, 0) + 1);
    }


    if (map1.equals(map2)) {
      System.out.println("The words are anagrams.");
    } else {
      System.out.println("The words are not anagrams.");
    }

    sc.close();
  }
}
