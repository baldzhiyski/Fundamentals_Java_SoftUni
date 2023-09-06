import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numOfCommands = Integer.parseInt(scan.nextLine());
        List<String> guestsList = new ArrayList<>();
        for (int i = 1; i <=numOfCommands ; i++) {
            String command = scan.nextLine();
            // command = [] is going!
            //command = [] is not going!
            String[] commandArr = command.split(" ");
            String name = commandArr[0];
            if(command.contains("not")){
                if(guestsList.contains(name)){
                    guestsList.remove(name);
                }else{
                    System.out.println(name + " is not in the list!");
                }
            }else{
                if(guestsList.contains(name)){
                    System.out.println(name + " is already in the list!");
                }else{
                    guestsList.add(name);
                }
            }
        }
        for (String eachGuest:guestsList) {
            System.out.println(eachGuest);
        }
    }
}
