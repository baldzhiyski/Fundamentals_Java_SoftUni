import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double amount = Double.parseDouble(input);
            if (amount == 0.2 || amount == 1 || amount == 0.1 || amount == 2 || amount == 0.5) {
                sum += amount;
            } else {
                System.out.printf("Cannot accept %.2f%n", amount);
            }
            input = scan.nextLine();
            }
        input = scan.nextLine();
        while (!input.equals("End")) {
            double price = 0;
            String product = "";
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    product="Nuts";
                    break;
                case "Water":
                    price = 0.7;
                    product="Water";
                    break;
                case "Crisps":
                    price = 1.5;
                    product="Crisps";
                    break;
                case "Soda":
                    price = 0.8;
                    product="Soda";
                    break;
                case "Coke":
                    price = 1.0;
                    product="Coke";
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (price>0) {
                if (sum >= price) {
                    sum -= price;
                    System.out.printf("Purchased %s%n", product);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            input = scan.nextLine();
        }
        System.out.printf("Change: %.2f%n",sum);
    }
}
