import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacityPerWagon = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while(!input.equals("end")){
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);
            if(command.equals("Add")){
                int numToAdd = Integer.parseInt(commandLine.get(1));
                numbersList.add(numToAdd);
            }else {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNum = numbersList.get(i);
                    if (currentNum + passengers <= maxCapacityPerWagon) {
                        numbersList.set(i, currentNum + passengers);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        for (int element:numbersList) {
            System.out.print(element + " ");
        }
    }
}
