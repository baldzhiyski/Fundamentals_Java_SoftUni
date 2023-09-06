import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int lostgames = Integer.parseInt(scan.nextLine());
        double priceOfHeadset = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int brokenHeadset = lostgames/2;
        int brokenMouses = lostgames/3;
        int brokenKeyboard = lostgames/6;
        int brokenDisplays = lostgames/12;
        double totall = brokenHeadset*priceOfHeadset + brokenMouses*mousePrice + brokenKeyboard*keyboardPrice +
                brokenDisplays*displayPrice ;
        System.out.printf("Rage expenses: %.2f lv.",totall);

    }
}
