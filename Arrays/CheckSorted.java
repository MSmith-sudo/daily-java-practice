import java.util.*;

public class CheckSorted{
  public static void main(String[] args){
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    boolean sorted = true;
    for (int i = 0; i < nums.length - 1; i++){
      if (nums[i] > nums[i + 1]){
        sorted = false;
        break;
      }
    }
    if (sorted){
      System.out.println("The array is sorted.");
    } else{
      System.out.println("The array is not sorted.");
    }
  }
}