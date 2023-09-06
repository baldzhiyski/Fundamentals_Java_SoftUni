import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String , Integer> chamber = new LinkedHashMap<>();
        int times = 0;
        List<String> listOfResource = new ArrayList<>();
        List<Integer> listOfQuantity = new ArrayList<>();
        while(!input.equals("stop")){
            times++;
            if(times%2!=0){
               String resource =input;
               listOfResource.add(resource);
            }else{
               int quantity = Integer.parseInt(input);
                listOfQuantity.add(quantity);
            }
            input=scan.nextLine();
        }
        int size = listOfResource.size();
        for (int i = 0; i <size ; i++) {
            if(chamber.containsKey(listOfResource.get(0))){
                chamber.put(listOfResource.get(0),chamber.get(listOfResource.get(0)) + listOfQuantity.get(0));
            }else{
            chamber.put(listOfResource.get(0),listOfQuantity.get(0));
            }
            listOfResource.remove(0);
            listOfQuantity.remove(0);

        }
        chamber.forEach((key,value) -> System.out.println(key + " -> " + value));
    }
}
