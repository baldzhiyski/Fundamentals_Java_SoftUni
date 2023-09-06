import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")){
     //       List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
     //       String command = commandLine.get(0);
            if(input.contains("Delete")){
                int numberForRemove = Integer.parseInt(input.split(" ")[1]);
//                numbersList.removeAll(Arrays.asList(numberForRemove));
               numbersList= numbersList.stream().filter(number->number!=numberForRemove).collect(Collectors.toList());
            }else if(input.contains("Insert")){
                int element = Integer.parseInt(input.split(" ")[1]);
                int position = Integer.parseInt(input.split(" ")[2]);
                numbersList.add(position,element);
            }
            input=scan.nextLine();
        }
        for (int num :numbersList) {
            System.out.print(num + " ");
        }
    }
}
