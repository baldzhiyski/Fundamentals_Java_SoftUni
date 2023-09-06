import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfOrders = Integer.parseInt(scan.nextLine());
        double totall = 0;
        for (int i = 1 ; i<=countOfOrders; i++){
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int copsuleCount = Integer.parseInt(scan.nextLine());
            double result=pricePerCapsule*days*copsuleCount;
            System.out.printf("The price for the coffee is: $%.2f%n",result);
            totall+=result;
        }
        System.out.printf("Total: $%.2f",totall);

    }
}
