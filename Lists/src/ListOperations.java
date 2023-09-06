import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("End")){
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            switch (command){
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    if(indexToRemove>=0 && indexToRemove<=numbersList.size()-1){
                    numbersList.remove(indexToRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    if(index>=0 && index<=numbersList.size()-1){
                    int num = Integer.parseInt(commandArr[1]);
                    numbersList.add(index,num);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case"Shift":
                    String direction = commandArr[1];
                    int count = Integer.parseInt(commandArr[2]);
                    if(direction.equals("left")){
                        for (int i = 1; i <=count ; i++) {
                            int firstEl = numbersList.get(0);
                            numbersList.remove(0);
                            numbersList.add(firstEl);
                        }
                    }else if(direction.equals("right")){
                        for (int i = 1; i <=count ; i++) {
                            int lastNum = numbersList.get(numbersList.size() - 1);
                            numbersList.remove(numbersList.size()-1);
                            numbersList.add(0,lastNum);
                        }
                    }
                    break;
            }
            input=scan.nextLine();
        }
        for (int element:numbersList) {
            System.out.print(element+ " ");
        }

    }

}
