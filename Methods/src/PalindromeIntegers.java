import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();

        while(!input.equals("END")){
            if(checkPalindrome(input)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            //System.out.println(checkPalindrome(input));
            input=scan.nextLine();
        }
    }
    public static boolean checkPalindrome(String text){
        String reversedText = "";
        for (int index = text.length()-1; index >=0 ; index--) {
            reversedText+=text.charAt(index);
        }
        return text.equals(reversedText);
    }
}
