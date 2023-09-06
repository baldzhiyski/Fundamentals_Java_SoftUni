import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("Go Shopping!")){
            String command = input.split(" ")[0];
            if(command.equals("Urgent")){
                String item = input.split(" ")[1];
                if(!groceries.contains(item)){
                    groceries.add(0,item);
                }
            }else if(command.equals("Unnecessary")){
                String item = input.split(" ")[1];
                groceries.remove(item);
            }else if(command.equals("Correct")){
                String oldItem = input.split(" ")[1];
                String newItem = input.split(" ")[2];
                if(groceries.contains(oldItem)){
                    groceries.set(groceries.indexOf(oldItem),newItem);
                }
            }else if(command.equals("Rearrange")){
                String item = input.split(" ")[1];
                if (groceries.contains(item)) {
                    groceries.remove(item);
                    groceries.add(item);
                }
            }
            input=scan.nextLine();
        }
        System.out.println(String.join(", ",groceries));
    }
}
