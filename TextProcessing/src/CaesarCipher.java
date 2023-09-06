import java.util.Scanner;

public class  CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder result = new StringBuilder();
        for (char symbol : input.toCharArray()) {
            symbol+=3;
            result.append(symbol);
        }
        System.out.println(result);
    }
}
