import java.util.*;


public class SumofEvens{
    public static void main(String[] args){
      int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int sum = 0;
      for (int i = 0; i < nums.length; i++){
        if (nums[i] % 2 == 0){
          sum += nums[i];
        }
        System.out.println(sum);
      }
  }
}