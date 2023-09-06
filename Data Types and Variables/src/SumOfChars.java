import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numberOfSymbols = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <=numberOfSymbols ; i++) {
            char character = scan.nextLine().charAt(0);
            sum+= character;
        }
        System.out.printf("The sum equals: " + sum);

    }
}
