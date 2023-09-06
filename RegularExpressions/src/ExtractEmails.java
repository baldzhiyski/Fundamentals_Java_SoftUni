import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> emailHolder = new ArrayList<>();
        String regex = "(?<userName>[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+)@(?<host>\\w+\\-?\\w+(\\.\\w+\\-?)+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            emailHolder.add(matcher.group());
        }
        System.out.println(String.join(System.lineSeparator(),emailHolder));
    }
}
