import java.util.Scanner;

public class MoreEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        String input = scan.nextLine();
        int sum = 0;
        if (firstChar > secondChar) {
            for (char symbol : input.toCharArray()) {
                if (symbol > secondChar && symbol <  firstChar) {
                    sum += symbol;
                }
            }
        } else {
            for (char symbol : input.toCharArray()) {
                if (symbol > firstChar && symbol < secondChar) {
                    sum +=  symbol;
                }
            }

        }
        System.out.println(sum);
    }
}
