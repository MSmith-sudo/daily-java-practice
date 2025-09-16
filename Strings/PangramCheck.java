import java.util.*;

public class PangramCheck{
  private static boolean checkIfPangram(String sentence){
   sentence = sentence.toLowerCase();
    Set<Character> set = new HashSet<>();

    for (char c : s.toCharArray()){
      if (c >= 'a' && c <= 'z'){
        set.add(c);
      }
    }
    return set.size() == 26;
  }
  public static void main(String[] args){
    String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
    String sentence2 = "leetcode";

    System.out.println(checkIfPangram(sentence1));
    System.out.println(checkIfPangram(sentence2));
  }
}