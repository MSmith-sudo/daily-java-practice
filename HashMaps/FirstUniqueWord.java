import java.util.*;

public class FirstUniqueWord{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your sentence: ");
    String s = sc.nextLine().toLowerCase();

    String[] words = s.split("\\W+");

    Map<String, Integer> frequency = new LinkedHashMap<>();

    for (String w: words){
      if (w.isEmpty()) continue;
      frequency.put(w, frequency.getOrDefault(w, 0) + 1);
    }

    for (Map.Entry<String, Integer> e : frequency.entrySet()){
      if (e.getValue() == 1){
        System.out.println("The first unique word is: " + e.getKey());
        sc.close();
        return;
      }
    }

    System.out.println("There are no unique words in the sentence.");
    sc.close();
  }
}