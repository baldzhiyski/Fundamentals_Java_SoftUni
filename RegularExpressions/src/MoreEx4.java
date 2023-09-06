import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoreEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numToSubtract = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        String regex = "@([A-Za-z]+)[^@\\-!:>]+!([A-Z])!";
        Pattern pattern = Pattern.compile(regex);
        List<String> names = new ArrayList<>();
        while(!input.equals("end")){
            String message = input;
            String decryptedMessage = decryptingMethod(message,numToSubtract);
            Matcher matcher = pattern.matcher(decryptedMessage);
            while(matcher.find()){
                if(matcher.group(2).equals("G")){
                   names.add(matcher.group(1));
                }

            }
            input = scan.nextLine();
        }
        System.out.println(String.join(System.lineSeparator(),names));
    }
    private static String decryptingMethod(String message,int n) {
        StringBuilder result = new StringBuilder();
        for (char symbol : message.toCharArray()) {
            symbol-=n;
            result.append(symbol);
        }
        return  result.toString();
    }
}
