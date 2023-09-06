import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> boughtFurniture = new ArrayList<>();
        String input = scan.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        double sum = 0;
        while(!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += quantity * price;
                boughtFurniture.add(matcher.group("furniture"));
            }
            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furniture : boughtFurniture) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
