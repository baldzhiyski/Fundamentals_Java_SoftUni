import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //1. взимам първата карта от ръката
        //2. премахвам картата от ръката
        //3. проверка кой печели:
        // карта 1 > карта 2 -> слагам накрая на ръката на първия -> карта 1 -> карта 2
        //карта 2 > карта 1 -> слагам накрая на ръката на втория -> карта 2 -> карта 1
        //карта 1 == карта 2 -> не ги добавяме никъде

        //играта продължава когато и двамата имат карти
        //играта спира, когато някой остане без карти
        while(firstPlayerCards.size()!=0 && secondPlayerCards.size()!=0){
            int firstPlayerCard =firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);
            if(firstPlayerCard>secondPlayerCard){
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            }else if(secondPlayerCard>firstPlayerCard){
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);
            }
        }
        //1. ако на първия му свършат картите
        if(firstPlayerCards.size()==0){
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondPlayerCards));
        }else if(secondPlayerCards.size()==0){
            System.out.printf("First player wins! Sum: %d",getCardsSum(firstPlayerCards));
        }
        //2. ако на втория му свършат картите
    }
    public static int getCardsSum(List<Integer> listCard){
        int sum = 0;
        for (int card:listCard) {
            sum+=card;
        }
        return sum;
    }
}
