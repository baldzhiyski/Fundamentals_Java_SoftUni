import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")){
           // List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
           // String commandLine = commandLine.get(0);
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Add":
                int numToAdd=Integer.parseInt(commandArr[1]);
                numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert =Integer.parseInt(commandArr[1]);
                    int insertToIndex = Integer.parseInt(commandArr[2]);
                    numbersList.add(insertToIndex,numToInsert);
                    break;
            }
            input=scan.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }

}
