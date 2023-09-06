import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([|#])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})?\\1(?<calories>\\d{1,5})\\1";


        Pattern pattern = Pattern.compile(regex);

        String items = scan.nextLine();
        Matcher input = pattern.matcher(items);
        List<String> item = new ArrayList<>();
        List<String> exDate = new ArrayList<>();
        List<String> cal = new ArrayList<>();
        int sumCalories = 0;

        while (input.find()) {
            item.add(input.group("itemName"));
            exDate.add(input.group("expirationDate"));
            cal.add(input.group("calories"));
            int calories = Integer.parseInt(input.group("calories"));


            sumCalories += calories;
        }

        int foodForCountDays = sumCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", foodForCountDays);
        for (int i = 0; i <= item.size() - 1; i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", item.get(i), exDate.get(i), cal.get(i));
        }
    }
}
