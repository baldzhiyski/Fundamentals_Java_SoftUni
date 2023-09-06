import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).
                toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int  currentNum = numbersArr[i];
            if(currentNum%2==0){
                evenSum+=currentNum;
            }else{
                oddSum+=currentNum;
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
