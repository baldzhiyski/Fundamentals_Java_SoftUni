import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(multiply(number));
    }
    public static int multiply(int num){
        return evenSum(num) * oddSum(num);
    }


    public  static int evenSum(int num){
        String intToString = Integer.toString(num);
        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int element:arr) {
            if(element%2==0) {
                sum += element;
            }
        }
        return  sum;
    }
    public  static int oddSum(int num) {
        String intToString = Integer.toString(num);
        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int element : arr) {
            if (element % 2 != 0) {
                sum += element;
            }
        }
        return sum;
    }
}
