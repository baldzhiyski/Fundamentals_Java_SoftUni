import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> carMapMileage = new LinkedHashMap<>();
        Map<String,Integer> carMapFuel = new LinkedHashMap<>();
        int n  = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] inputArr = input.split("\\|");
            String car = inputArr[0];
            int mileage = Integer.parseInt(inputArr[1]);
            int fuel = Integer.parseInt(inputArr[2]);
            carMapFuel.put(car,fuel);
            carMapMileage.put(car,mileage);
        }
        String commands = scan.nextLine();
        while(!commands.equals("Stop")){
            String[] commandsArr = commands.split(" : ");
            String givenCar = commandsArr[1];
            switch (commandsArr[0]){
                case "Drive":
                    int distance = Integer.parseInt(commandsArr[2]);
                    int fuel = Integer.parseInt(commandsArr[3]);
                   if(carMapFuel.get(givenCar)<fuel){
                       System.out.println("Not enough fuel to make that ride");
                   }else{
                       carMapMileage.put(givenCar,carMapMileage.get(givenCar)+distance);
                       carMapFuel.put(givenCar,carMapFuel.get(givenCar)-fuel);
                       System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",givenCar,distance,fuel);
                   }
                   if(carMapMileage.get(givenCar)>=100000){
                       carMapMileage.remove(givenCar);
                       System.out.printf("Time to sell the %s!%n",givenCar);
                   }
                    break;
                    case "Refuel":
                        int refueledLiter;
                        int fuelToRefuel = Integer.parseInt(commandsArr[2]);
                        int currentFuel = carMapFuel.get(givenCar);
                        int whole = fuelToRefuel+currentFuel;
                        if(whole<=75){
                            carMapFuel.put(givenCar,whole);
                            refueledLiter=fuelToRefuel;
                        }else{
                            carMapFuel.put(givenCar,75);
                            refueledLiter=75-currentFuel;
                        }
                        System.out.printf("%s refueled with %d liters%n",givenCar,refueledLiter);
                        break;
                case "Revert":
                    int kilometres = Integer.parseInt(commandsArr[2]);
                    int currentMileage = carMapMileage.get(givenCar);
                    if(currentMileage-kilometres>=10000){
                        carMapMileage.put(givenCar,currentMileage-kilometres);
                        System.out.printf("%s mileage decreased by %d kilometers%n",givenCar,kilometres);
                    }else{
                        carMapMileage.put(givenCar,10000);
                    }
                    break;
            }
            commands=scan.nextLine();
        }
        carMapMileage.entrySet().forEach(stringIntegerEntry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue(),
                    carMapFuel.get(stringIntegerEntry.getKey()));
        });
    }
}
