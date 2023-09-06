import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
        String input = scan.nextLine();
        while (!input.equals("stop")) {
            String playerMove = input;
            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = ROCK;
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = PAPER;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid input.Try Again...");
                System.out.println();
                System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
                input=scan.nextLine();
                continue;
            }
            Random random = new Random();
            int computerRandomNum = random.nextInt(3);
            String computerMove = "";
            switch (computerRandomNum) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;
            }
            System.out.printf("The computer chose %s.%n", computerMove);
            if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                    (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
                System.out.println("You win.");
                System.out.println();
            } else if ((computerMove.equals(ROCK) && playerMove.equals(SCISSORS)) ||
                    (computerMove.equals(PAPER) && playerMove.equals(ROCK)) ||
                    (computerMove.equals(SCISSORS) && playerMove.equals(PAPER))) {
                System.out.println("You lose.");
                System.out.println();
            } else {
                System.out.println("This game was a draw.");
                System.out.println();
            }
            System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
            input = scan.nextLine();
        }

    }
}
