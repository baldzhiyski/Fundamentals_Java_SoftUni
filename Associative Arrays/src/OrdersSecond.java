import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrdersSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, double[]> products = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] productData = input.split(" ");
            String name = productData[0];
            double price = Double.parseDouble(productData[1]);
            int quantity = Integer.parseInt(productData[2]);

            if (products.containsKey(name)) {
                double[] productInfo = products.get(name);
                double existingPrice = productInfo[0];
                int existingQuantity = (int) productInfo[1];
                productInfo[0] = price;
                productInfo[1] = existingQuantity + quantity;
            } else {
                double[] productInfo = { price, quantity };
                products.put(name, productInfo);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, double[]> entry : products.entrySet()) {
            String productName = entry.getKey();
            double[] productInfo = entry.getValue();
            double price = productInfo[0];
            int quantity = (int) productInfo[1];
            double totalPrice = price * quantity;
            System.out.printf("%s -> %.2f%n", productName, totalPrice);
        }
    }
}
