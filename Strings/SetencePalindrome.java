import java.util.Scanner;

public class SetencePalindrome {
    private static boolean isAlnum(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isAlnum(s.charAt(i)))
                i++;
            while (i < j && !isAlnum(s.charAt(j)))
                j--;

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));

            if (left != right) {
                System.out.println("Not a palindrome.");
                sc.close();
                return;
            }
            i++;
            j--;
        }

        System.out.println("It is a palindrome!");
        sc.close();
    }
}
