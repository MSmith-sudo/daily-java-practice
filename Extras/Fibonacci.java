import java.util.*;

public class Fibonacci {
    private static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    private static void fibIterative(int n) {
        int a = 0, b = 1;
        System.out.println("Iterative Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        fibIterative(n);

        System.out.println("Recursive Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}
