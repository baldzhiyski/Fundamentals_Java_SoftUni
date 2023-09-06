import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoreEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "(\\D+)(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while(matcher.find()){
            int count = Integer.parseInt(matcher.group(2));
            for (int i = 0; i <count ; i++) {
            result.append(matcher.group(1).toUpperCase());
            }
        }
        System.out.println("Unique symbols used: "+ result.chars().distinct().count());
        System.out.println(result);
    }
}
