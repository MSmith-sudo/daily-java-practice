public class LargestInArray {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 18, 25, 47, 52, 99 };
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) { // start from index 1
            if (nums[i] > largest) {
                largest = nums[i]; // update largest
            }
        }

        System.out.println("The largest number is: " + largest + ".");
    }
}
