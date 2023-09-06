import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equals("end")){
            String text = input;
            String result = "";
            for (int i = text.length()-1; i >= 0 ; i--) {
                char symbol = text.charAt(i);
                result+=symbol;
            }
            System.out.printf("%s = %s%n",text,result);
            input=scan.nextLine();
        }
    }
}
