import java.util.Random;
import java.util.Scanner;

public class GuessAnumber {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        Random randomNum = new Random();
        int computerNumber = randomNum.nextInt(100);
        System.out.print("Guess a number (1-100): ");
        String input = scan.nextLine();
        while(!input.equals("Stop the game")){
            String playerInput = input;
            int playerNum = Integer.parseInt(playerInput);
            boolean isValid = true;
            for (int i = 0; i <playerInput.length() ; i++) {
                if(playerInput.charAt(i)<48 && playerInput.charAt(i) >57){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                if(playerNum==computerNumber){
                    System.out.println("You guessed it !");
                    System.out.print("Do you want to play more ?: ");
                    String answer = scan.nextLine();
                    if(answer.equals("no")){
                        break;
                    }
                }else if(playerNum>computerNumber){
                    System.out.println("Too High");
                }else {
                    System.out.println("Too Low");
                }
            }
            System.out.print("Guess a number (1-100): ");
            input=scan.nextLine();
        }
    }
}
