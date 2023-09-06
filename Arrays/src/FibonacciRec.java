import java.util.*;

public class FibonacciRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = getFibonacci(n);
        System.out.println(result);
    }

    public static int getFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
