import java.util.*;

public class CharFrequency{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a word:");
    String word = sc.nextLine().toLowerCase();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < word.length(); i++){
    char c = word.charAt(i);
      if (Character.isLetter(c)){
    map.put(c, map.getOrDefault(c, 0) + 1);
    }
  }
    for (Map.Entry<Character, Integer> entry : map.entrySet()){
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    sc.close();
  }
}