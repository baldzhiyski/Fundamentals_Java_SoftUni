import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        String message = "";
        int numLines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <numLines ; i++) {
            char symbol = scan.nextLine().charAt(0);
            // int correctLetter = key + (int)symbol;
            // message += (char)correctLetter
            symbol+=key;
            message+=symbol;
        }
        System.out.println(message);
    }
}
