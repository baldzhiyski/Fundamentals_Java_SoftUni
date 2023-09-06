import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String,int[]> mapOfTowns = new LinkedHashMap<>();
        while (!command.equals("Sail")){
            String[] commandArr = command.split("\\|\\|");
            String town = commandArr[0];
            int gold = Integer.parseInt(commandArr[2]);
            int people = Integer.parseInt(commandArr[1]);

            mapOfTowns.putIfAbsent(town,new int[2]);
            mapOfTowns.get(town)[0] = mapOfTowns.get(town)[0] + people;
            mapOfTowns.get(town)[1]= mapOfTowns.get(town)[1] + gold;

            command=scan.nextLine();
        }
        String nextInput = scan.nextLine();
        while(!nextInput.equals("End")){
            String[] inputArr = nextInput.split("=>");
            String town = inputArr[1];
            switch (inputArr[0]){
                case"Plunder":
                    int people = Integer.parseInt(inputArr[2]);
                    int gold = Integer.parseInt(inputArr[3]);
                    int currentPeople = mapOfTowns.get(town)[0];
                    int currentGold = mapOfTowns.get(town)[1];

                    mapOfTowns.get(town)[0]=currentPeople-people;
                    mapOfTowns.get(town)[1]=currentGold-gold;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    if(mapOfTowns.get(town)[0]==0|| mapOfTowns.get(town)[1]==0) {
                        mapOfTowns.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int goldSecond= Integer.parseInt(inputArr[2]);
                    if(goldSecond<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        mapOfTowns.get(town)[1]+=goldSecond;
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldSecond,town,mapOfTowns.get(town)[1]);
                    }
                    break;
            }
            nextInput=scan.nextLine();
        }
        if(mapOfTowns.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",mapOfTowns.size());
            mapOfTowns.entrySet().forEach((key-> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", key.getKey(),key.getValue()[0],key.getValue()[1])));
        }
    }
}
