import java.util.Scanner;

public class AverageInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;

        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        System.out.println("You entered:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        double average = (double) sum / nums.length;
        System.out.println("The average of the numbers you entered is: " + average);

        sc.close();
    }
}
