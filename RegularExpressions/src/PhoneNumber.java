import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);

        List<String> validPhoneNumbers = new ArrayList<>();
        while(matcher.find()){
            validPhoneNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ",validPhoneNumbers));
    }
}
