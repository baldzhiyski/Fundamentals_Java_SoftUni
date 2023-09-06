package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        while(!command.equals("End")){
            String[] commandArr = command.split(" ");
            String typeOfVehicle = commandArr[0];
            String model = commandArr[1];
            String color = commandArr[2];
            int horsePower = Integer.parseInt(commandArr[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle,model,color,horsePower);
            vehicleList.add(vehicle);
            command=scan.nextLine();
        }
        String model = scan.nextLine();
        while(!model.equals("Close the Catalogue")){
            for (Vehicle vehicle:vehicleList) {
                if(vehicle.getModelOfVehicle().equals(model)){
                    if(vehicle.getTypeOfVehicle().equals("car")){
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n","Car",
                            vehicle.getModelOfVehicle(),vehicle.getColor(),vehicle.getHorsePower());
                    }else{
                        System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n","Truck",
                                vehicle.getModelOfVehicle(),vehicle.getColor(),vehicle.getHorsePower());
                    }
                }
            }
            model=scan.nextLine();
        }
        double sumCars = 0;
        int timesCars = 0;
        double sumTrucks = 0;
        int timesTrucks = 0;
        for (Vehicle vehicle:vehicleList) {
            if(vehicle.getTypeOfVehicle().equals("car")){
                timesCars++;
                sumCars+=vehicle.getHorsePower();
            }else{
                timesTrucks++;
                sumTrucks+=vehicle.getHorsePower();
            }
        }
        double averageCars = sumCars/timesCars;
        double averageTrucks = sumTrucks/timesTrucks;
        if(timesCars==0){
            averageCars=0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCars);
        if(timesTrucks==0){
            averageTrucks=0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageTrucks);
    }
}
