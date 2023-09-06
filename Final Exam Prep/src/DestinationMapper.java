import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String>destinations = new ArrayList<>();
        String regexForValidLocations = "([=\\/])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regexForValidLocations);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            destinations.add(matcher.group(2));
        }
        System.out.println("Destinations: "+ String.join(", ",destinations));
        calculateMethod(destinations);
    }
    public static void calculateMethod(List<String> destinations){
        int sum = 0;
        for (String destination : destinations) {
            sum+=destination.length();
        }
        System.out.println("Travel Points: " + sum);
    }
}
