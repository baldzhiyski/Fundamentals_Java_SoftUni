import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();
        // 2 3 4 5 6 18 29 30 57
        String[] inputArr = input.split(" ");
        int[] numbersArr = new int[inputArr.length];
        for (int i = 0; i <numbersArr.length ; i++) {
            numbersArr[i]=Integer.parseInt(inputArr[i]);

        }
        // int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int currentElement : numbersArr) {
            if (currentElement % 2 == 0) {
                sum += currentElement;
            }
        }
        System.out.println(sum);

    } 
}
