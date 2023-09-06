import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String , Integer > quantityList = new LinkedHashMap<>();
        LinkedHashMap<String , Double > priceList = new LinkedHashMap<>();
        while (!input.equals("buy")) {
        String[] array = input.split(" ");
        String product = array[0];
        double price = Double.parseDouble(array[1]);
        int quantity = Integer.parseInt(array[2]);
        if(!priceList.containsKey(product)){
           priceList.put(product,price);
           quantityList.put(product,quantity);
        }else{
           quantityList.put(product,quantityList.get(product) + quantity);
           if(price!=priceList.get(product)){
               priceList.put(product,price);
           }
        }
        input=scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceList.entrySet()) {
            String name = entry.getKey();
            double sum = entry.getValue() *quantityList.get(name);
            System.out.printf("%s -> %.2f%n",entry.getKey(),sum);
        }

    }
}
