import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        double priceOfCurrentGame = 0;
        double totallspent = 0;
        String input = scan.nextLine();
        while(!input.equals("Game Time")){
            switch (input){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    priceOfCurrentGame=39.99;
                    break;
                case "CS: OG":
                    priceOfCurrentGame=15.99;
                    break;
                case "Zplinter Zell":
                    priceOfCurrentGame=19.99;
                    break;
                case "Honored 2":
                    priceOfCurrentGame=59.99;
                    break;
                case "RoverWatch":
                    priceOfCurrentGame=29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input=scan.nextLine();
                    continue;
            }
            if(money>0){
                if(money>=priceOfCurrentGame){
                    System.out.printf("Bought %s%n",input);
                    totallspent+=priceOfCurrentGame;
                    money-=priceOfCurrentGame;
                }else{
                    System.out.println("Too Expensive");
                }
            }else{
                break;
            }
            input=scan.nextLine();
        }
        if(money>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totallspent,money);
        }else{
            System.out.println("Out of money!");
        }

    }
}
