import java.util.*;

public class MoveZeroes{
  private static void moveZeroes(int[] nums){
    int write = 0;
    for (int read = 0; read < nums.length; read++){
      if (nums[read] != 0){
        nums[write] = nums[read];
        write++;
      }
    }
    for (int i = write; i < nums.length; i++){
      nums[i] = 0;
    }
  }

    public static void main(String[] args){
      int[] nums = {0, 1, 0, 3, 12};
      moveZeroes(nums);
      System.out.println(Arrays.toString(nums));
      System.out.println("nums = " + Arrays.toString(nums));
    }
  }