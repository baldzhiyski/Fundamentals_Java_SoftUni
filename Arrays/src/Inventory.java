import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<String> items = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String command = scan.nextLine();
        while(!command.equals("Craft!")){
            String[] commandsArr = command.split(" - ");
            String firstCommand = commandsArr[0];
            switch (firstCommand){
                case "Collect":
                    String item = commandsArr[1];
                    if(!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case"Drop":
                    String name =commandsArr[1];
                    if(items.contains(name)){
                        items.remove(name);
                    }
                    break;
                case"Combine Items":
                    String combined = commandsArr[1];
                    String oldItem = combined.split(":")[0];
                    String newItem = combined.split(":")[1];
                    if(items.contains(oldItem)){
                        if(items.indexOf(oldItem) == items.size()-1){
                            items.add(newItem);
                        }else{
                         items.add(items.indexOf(oldItem ) +1,newItem );
                        }
                    }
                    break;
                case"Renew":
                    String word = commandsArr[1];
                    if(items.contains(word)){
                        items.remove(word);
                        items.add(word);
                    }
                    break;
            }
            command=scan.nextLine();
        }
        System.out.println(items.toString().replace("[","").replace("]",""));
    }
}
