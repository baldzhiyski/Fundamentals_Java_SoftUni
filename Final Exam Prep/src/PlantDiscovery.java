import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> nameAndRarity = new LinkedHashMap<>();
        Map<String, List<Double>> nameAndRate = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scan.nextLine();
            String[] commandArr = command.split("<->");
            String plantName = commandArr[0];
            int rarity = Integer.parseInt(commandArr[1]);
            nameAndRarity.put(plantName, rarity);
            nameAndRate.putIfAbsent(plantName,new ArrayList<>());
        }
        String input = scan.nextLine();
        while (!input.equals("Exhibition")) {
            String[] inputArr = input.split(": ");
            String command = inputArr[0];
            switch (command) {
                case "Rate":
                    String[] newArr = inputArr[1].split(" - ");
                    String plant = newArr[0];
                    double rating = Double.parseDouble(newArr[1]);
                    if (nameAndRate.containsKey(plant)){
                        nameAndRate.get(plant).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] newArrSecond = inputArr[1].split(" - ");
                    String plantSecond = newArrSecond[0];
                    int rarity = Integer.parseInt(newArrSecond[1]);
                    if (nameAndRarity.containsKey(plantSecond)) {
                        nameAndRarity.put(plantSecond, rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plantToReset = inputArr[1];
                    if (nameAndRate.containsKey(plantToReset)) {
                        List<Double> currentList = nameAndRate.get(plantToReset);
                        currentList.clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");


//        for (Map.Entry<String, Integer> entry : nameAndRarity.entrySet()) {
//            String plantName = entry.getKey();
//            int rarity = entry.getValue();
//            double average = nameAndRate.get(plantName).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
//            System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f", plantName, rarity, average));
//        }

        nameAndRarity.entrySet().forEach(stringIntegerEntry -> {
        double average = 0;
        if(!nameAndRate.get(stringIntegerEntry.getKey()).isEmpty()){
        average = calculateAverage(nameAndRate.get(stringIntegerEntry.getKey()));
        }
        System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue(),average);
        });

        }
public static double calculateAverage(List<Double> list) {
        double average = 0;
        for (Double aDouble : list) {
        average += aDouble;
        }
        average/=list.size();
        return average;
    }
}

