import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] banWords = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for (String banWord : banWords) {
            String asterisk = repeatString(banWord);
            text=text.replace(banWord,asterisk);
        }
        System.out.println(text);
    }
//    public static String repeatString(String word){
//        String result = "";
//        for (int i = 0; i <word.length() ; i++) {
//            result+="*";
//        }
//        return result;
//    }
    public static String repeatString(String word){
        return "*".repeat(word.length());
    }
}