import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        if(product.equals("coffee")){
            printResult(quantity,1.50);
        }else if(product.equals("water")){
            printResult(quantity,1.00);
        }else if(product.equals("coke")){
            printResult(quantity,1.40);
        }else if(product.equals("snacks")){
            printResult(quantity,2.00);
        }
    }
    public static void printResult(int number , double price){
        double result = number*price;
        System.out.printf("%.2f",result);
    }
}
