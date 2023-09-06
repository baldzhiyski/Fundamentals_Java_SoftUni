import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numberOfLetters = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=numberOfLetters ; i++) {
            int inputNumbers = Integer.parseInt(scan.nextLine());
            String numberAsText = Integer.toString(inputNumbers);
            int digitsCount = numberAsText.length();
            int mainDigit = inputNumbers%10;
            int offset = (mainDigit-2)*3;
            if(mainDigit==8 || mainDigit==9){
                offset++;
            }
            int letterIndex = offset + digitsCount - 1;
            if(inputNumbers==0){
                System.out.print(" ");
            }else{
                System.out.print((char)(letterIndex+97));
            }
        }
    }
}
