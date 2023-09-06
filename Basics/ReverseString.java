import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String word = scan.nextLine();
        String reversed = "";
        for (int i = word.length() - 1; i>=0 ; i--) {
            char currentSymbol = word.charAt(i);
            reversed+=currentSymbol;
        }
        System.out.println(reversed);
    }
}
