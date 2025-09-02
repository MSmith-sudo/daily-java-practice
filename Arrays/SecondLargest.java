public class SecondLargest{
  public static void main(String[] args){
    int array[] = {5, 25, 60, 100, 45, 78, 99, 1, 27, 555};
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++){
      if (array[i] > largest){
        secondlargest = largest;
        largest = array[i];
      } else if (array[i] > secondlargest && array[i] != largest){
        secondlargest = array[i];
      }
      }
    if (secondlargest == Integer.MIN_VALUE){
      System.out.println("There is no second largest number in the array.");
    } else{
      System.out.println("The second largest number in the array is: " + secondlargest + ".");
    }
    }
}
