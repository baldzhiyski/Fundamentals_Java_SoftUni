import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char symbol : input.toCharArray()) {
            if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else if (Character.isDigit(symbol)) {
                digits.append(symbol);
            }else if(!Character.isLetterOrDigit(symbol)){
                others.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
