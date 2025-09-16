import java.util.*;

public class ReverseVowels{
  private static boolean isVowel(char c){
    return "aeiouAEIOU".indexOf(c) != -1;
  }
    private static String reverseVowels(String s){
      char[] arr = s.toCharArray();
      int left = 0, right = arr.length - 1;

      while (left < right){
        while (left < right && !isVowel(arr[left])) left++;
        while (left < right && !isVowel(arr[right])) right--;
        if (left < right){
          char tmp = arr[left];
          arr[left] = arr[right];
          arr[right] = tmp;
          left++;
          right--;
        }
      }
      return new String(arr);
    }
  public static void main(String[] args){
    System.out.println(reverseVowels("hello"));
    System.out.println(reverseVowels("leetcode"));
  }
}
