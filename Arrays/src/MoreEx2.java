import java.util.Scanner;

public class MoreEx2 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int num = 1; // First element of each row is always 1

            // Padding for formatting purposes
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the elements of each row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Calculate the next element
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
