
    import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class AdAstraSecond {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String regexFoodCalories = "(?<Separator>[\\|#]+)(?<ItemName>[A-Za-z\\s]+)(\\1)(?<ExpirationDate>\\d{2}/\\d{2}/\\d{2})(\\1)(?<Calories>\\d+)(\\1)";

            String itemName = "ItemName";
            String expirationDate = "ExpirationDate";
            String calories = "Calories";

            String input = scanner.nextLine();

            int dailyCaloriesNeeded = 2000;
            int totalCaloriesPacked = 0;

            Pattern patternCalories = Pattern.compile(regexFoodCalories);
            Matcher matcherCalories = patternCalories.matcher(input);

            while (matcherCalories.find()) {
                String currentCalories =  matcherCalories.group(calories);
                totalCaloriesPacked += Integer.parseInt(currentCalories);
            }

            System.out.printf("You have food to last you for: %d days!\n", totalCaloriesPacked / dailyCaloriesNeeded);

            Pattern patternFood = Pattern.compile(regexFoodCalories);
            Matcher matcherFood = patternFood.matcher(input);

            while (matcherFood.find()) {
                String currentItemName = matcherFood.group(itemName);
                String currentExpirationDate = matcherFood.group(expirationDate);
                String currentCalories =  matcherFood.group(calories);
                System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n", currentItemName, currentExpirationDate, currentCalories);
            }
        }
    }
