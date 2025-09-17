import java.util.*;

public class RemoveDuplicatesSorted{
  private static int removeDuplicates(int[] nums){
    if (nums.length == 0) return 0;
    int write = 1;
    for (int read = 1; read < nums.length; read++){
      if (nums[read] != nums[read - 1]){
        nums[write] = nums[read];
        write++;
      }
    }
    return write;

    public static void main(String[] args){
      int[] nums = {1, 1, 2};
      int k = removeDuplicates(nums);
      System.out.println("k = " + k);
      System.out.println("nums = " + Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
    }
  }
}