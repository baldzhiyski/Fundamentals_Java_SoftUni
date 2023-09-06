import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = numbersList.size();
        for (int i = 0; i <size/2; i++) {
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(numbersList.size()-1);
            int sum = firstNum+secondNum;
            numbersList.set(i,sum);
            numbersList.remove(numbersList.size()-1);
        }
        printMethod(numbersList);

    }public static void printMethod(List<Integer> list){
        for (int item:list) {
            System.out.print(item+" ");
        }
    }
}
