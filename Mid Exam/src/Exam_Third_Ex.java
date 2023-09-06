import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam_Third_Ex {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<String> listOfCards = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        int numOfCommands = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=numOfCommands ; i++) {
            String[] commands = scan.nextLine().split(", ");
            String word = commands[0];
            if(word.equals("Add")){
                String cardName = commands[1];
                if(listOfCards.contains(cardName)){
                    System.out.println("Card is already in the deck");
                }else{
                    listOfCards.add(cardName);
                    System.out.println("Card successfully added");
                }
            }else if(word.equals("Remove")){
                String nameOfCard = commands[1];
                if(!listOfCards.contains(nameOfCard)){
                    System.out.println("Card not found");
                }else{
                    listOfCards.remove(nameOfCard);
                    System.out.println("Card successfully removed");
                }
            }else if(word.equals("Remove At")){
                int index = Integer.parseInt(commands[1]);
                if(isValid(index,listOfCards)){
                    listOfCards.remove(index);
                    System.out.println("Card successfully removed");
                }else{
                    System.out.println("Index out of range");
                }
            }else if(word.equals("Insert")){
                int index = Integer.parseInt(commands[1]);
                String name = commands[2];
                if(isValid(index,listOfCards)){
                    if(!listOfCards.contains(name)){
                    listOfCards.add(index,name);
                    System.out.println("Card successfully added");
                    }else{
                        System.out.println("Card is already added");
                    }
                }else{
                    System.out.println("Index out of range");
                }
            }
        }
        System.out.println(listOfCards.toString().replace("[","").trim().replace("]",""));
    }
    private static boolean isValid(int index,List<String> cards){
        return index>=0 && index<=cards.size()-1;
    }
}
