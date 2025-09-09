import java.util.*;

public class MissingNumberSum{
  public static void main(String[] args){
    int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9, 10};
    int n = numbers.length + 1;

    long expected = (long) n * (n + 1) / 2;

    long actual = 0;
    for (int num : numbers){
      actual += num;
    }
    long missing = expected - actual;

    System.out.println("The missing number is: " + missing);
  }
}