import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String[] firstArray = scan.nextLine().split(" ");
        String[] secondArray = scan.nextLine().split(" ");
        // We can use just for loop but with foreach it looks better
        for (String i: secondArray) {
            for (String value : firstArray) {
                if (i.equals(value)) {
                    System.out.print(i + " ");
                }
            }

        }
    }
}
