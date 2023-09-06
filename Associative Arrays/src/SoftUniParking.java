import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String , String> carMap = new LinkedHashMap<>();
        for (int i = 1; i <=times ; i++) {
            String[] array = scan.nextLine().split(" ");
            String command = array[0];
            String username = array[1];
            if(command.equals("register")){
                String licencePlateNumber = array[2];
                if(!carMap.containsKey(username)){
                    carMap.put(username,licencePlateNumber);
                    System.out.println(username + " registered " + licencePlateNumber+  " successfully");
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n",licencePlateNumber);
                }
            }else if(command.equals("unregister")){
                if (!carMap.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n",username);
                }else{
                    carMap.remove(username);
                    System.out.printf("%s unregistered successfully%n",username);
                }
            }
        }
        carMap.forEach((key,value) ->
                System.out.println(key+ " => " + value));
    }
}
