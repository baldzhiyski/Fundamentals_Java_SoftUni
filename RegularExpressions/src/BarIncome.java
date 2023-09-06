import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|[^|$%.]*(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        double total = 0;
        while(!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));
                double totalPerProduct = price * count;
                total+=totalPerProduct;
                System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"),totalPerProduct);
            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f",total);
    }
}
