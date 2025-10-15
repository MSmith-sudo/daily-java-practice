import java.util.*;

public class RecursiveBinarySearch{
  private static int binarySearch(int[] arr, int target, int left, int right){
    if (left > right){
      return -1;
    }
    int mid = (left + right)/2;
    if(arr[mid] == target){
      return mid;
    }
    if(arr[mid] > target){
      return binarySearch(arr, target, left, mid-1);
    }
    else{
      return binarySearch(arr, target, mid+1, right);
    }
    public static void main(String[] args){
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int target = 2;
      System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
  }
}