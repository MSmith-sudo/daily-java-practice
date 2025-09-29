import java.util.*;

public class CountWords{
  private static int countWords(String s){
    String[] words = s.trim().split("\\s+");
    return words.length;
  }
  public static void main(String[] args){
    String s = "Hello World";
    System.out.println("Word Count: " + countWords(s));
  }
}