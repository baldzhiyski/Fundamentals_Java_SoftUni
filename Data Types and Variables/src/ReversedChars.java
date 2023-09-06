import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);
        char thirdSymbol = scan.nextLine().charAt(0);
        //Index 0 so we can take the first letter
        System.out.printf("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);
    }
}
