import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        printMatrix(number);
    }
    public static void printMatrix(int num) {
        for (int rows = 1; rows <= num; rows++) {
            for (int colons = 1; colons <= num; colons++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

