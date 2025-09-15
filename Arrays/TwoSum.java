import java.util.*;

public class TwoSum{
  public static void main(String[] args){
    int[] integers = {2, 7, 11, 15};
    int target = 9;

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < integers.length; i++){
      int complement = target - integers[i];
      if (map.containsKey(complement)){
        System.out.println("[" + map.get(complement) + ", " + i + "]");
        return;
      }
      map.put(integers[i], i);
    }
  }
}