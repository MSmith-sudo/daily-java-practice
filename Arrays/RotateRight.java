import java.util.*;

public class RotateRight{
  public static void main(String[] args){
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 2;

    k %= nums.length;

    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

    System.out.println(Arrays.toString(nums));
    
  }

  private static void reverse(int[] nums, int start, int end){
    while (start < end){
      int tmp = nums[start];
      nums[start] = nums[end];
      nums[end] = tmp;
      start++;
      end--;
    }
  }
}