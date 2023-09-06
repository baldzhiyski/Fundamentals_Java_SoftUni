import java.util.Scanner;

public class VowolsCount {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        printCountVowels(text);
    }
    public static void printCountVowels(String text){
        int count = 0;
        for (char symbol: text.toCharArray()) {
            if(symbol == 'a' || symbol=='u' || symbol=='o' || symbol=='e' || symbol=='i'){
                count++;
            }
        }
        System.out.println(count);
    }
}
