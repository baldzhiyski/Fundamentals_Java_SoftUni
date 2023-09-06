import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String text = scan.nextLine();
        printMiddleCharacter(text);

    }
    public static void printMiddleCharacter(String text){
        if(text.length() %2!=0){
            int indexOfMiddleCharacter = text.length() / 2;
            String[] newText = text.split("");
            //System.out.println(text.charAt(indexOfMiddleCharacter));
            System.out.println(newText[indexOfMiddleCharacter]);

        }else{
            int indexFirstMiddle = text.length()/2 - 1;
            int indexSecondMiddle = text.length()/2;
            System.out.print(text.charAt(indexFirstMiddle));
            System.out.print(text.charAt(indexSecondMiddle));

        }
    }
}
