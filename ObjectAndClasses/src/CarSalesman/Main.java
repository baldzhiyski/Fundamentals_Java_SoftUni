package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String input = scan.nextLine();
            String[] inputArr = input.split("\\s+");
            String model = inputArr[0];
            int power = Integer.parseInt(inputArr[1]);
            String displacement = "n/a";
            String efficiency = "n/a";
            if(inputArr.length==3){
                String word = inputArr[2];
                for (char c :word.toCharArray()) {
                    if(Character.isDigit(c)){
                        displacement=inputArr[2];
                    }else{
                        efficiency=inputArr[2];
                    }
                }
            }else if(inputArr.length==4){
                displacement=inputArr[2];
                efficiency=inputArr[3];
            }
            Engine engine = new Engine(model,power,displacement,efficiency);
            engineList.add(engine);
        }
        int n2 = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=n2 ; i++) {
            String[] commandArr = scan.nextLine().split("\\s+");
            String model = commandArr[0];
            String engine = commandArr[1];
            String weight  = "n/a";
            String color = "n/a";
            if(commandArr.length==3) {
                String word = commandArr[2];
                for (char c : word.toCharArray()) {
                    if (Character.isDigit(c)) {
                        weight = commandArr[2];
                    } else {
                        color = commandArr[2];
                    }
                }
            }else if(commandArr.length==4){
                weight=commandArr[2];
                color=commandArr[3];
            }
            Car car = new Car(model,engine,weight,color);
            carList.add(car);
        }
        for (Car car: carList ) {
            System.out.printf("%s:%n", car.getModel());
            for (Engine engine : engineList){
                if (car.getEngine().equals(engine.getModel())){
                    System.out.printf("  %s:%n", engine.getModel());
                    System.out.printf("    Power: %s%n", engine.getPower());
                    System.out.printf("    Displacement: %s%n", engine.getDisplacement());
                    System.out.printf("    Efficiency: %s%n", engine.getEfficiency());
                    break;
                }
            }
            System.out.printf("  Weight: %s%n", car.getWeight());
            System.out.printf("  Color: %s%n", car.getColor());
        }

    }
}
