import java.util.*;

public class MaxElementInArray{
  private static int findMax(int[] nums){
    int max = nums[0];
    for (int i = 1; i < nums.length; i++){
      if (nums[i] > max){
        max = nums[i];
      }
    }
    return max;
  }

public static void main(String[] args){
  int[] nums = {1, 2, 3, 4, 5};
  System.out.println(findMax(nums));
  System.out.println("Max element in array is: " + findMax(nums));
  }
}