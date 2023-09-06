import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<String> elements = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        String input = scan.nextLine();
        int move = 0;
        while(!input.equals("end")){
            move++;
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            if(!isInRange(firstIndex,elements) || !isInRange(secondIndex,elements) || firstIndex==secondIndex){
                    int indexOfAdding = elements.size()/2;
                    String elementToAdd = "-" + move + "a";
                    elements.add(indexOfAdding , elementToAdd);
                    elements.add(indexOfAdding+1,elementToAdd);
            System.out.println("Invalid input! Adding additional elements to the board");
            }else if(isInRange(firstIndex,elements) && isInRange(secondIndex,elements) && firstIndex!=secondIndex ){
                if(elements.get(firstIndex).equals(elements.get(secondIndex))){
                    System.out.printf("Congrats! You have found matching elements - %s!%n",elements.get(firstIndex));
                    if(firstIndex>secondIndex){
                        elements.remove(firstIndex);
                        elements.remove(secondIndex);
                    }else{
                        elements.remove(secondIndex);
                        elements.remove(firstIndex);
                    }
                }else{
                    System.out.println("Try again!");
                }
            }
            if(elements.isEmpty()){
                System.out.printf("You have won in %d turns!",move);
                break;
            }
            input=scan.nextLine();
        }
        if(!elements.isEmpty()){
            System.out.println("Sorry you lose :(");
            printMethod(elements);
        }
    }
    public static boolean isInRange(int index , List<String> el){
        return index>=0 && index<el.size();
    }
    private static void printMethod(List<String> list){
        for (String num:list) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
