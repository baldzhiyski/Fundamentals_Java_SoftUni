import java.util.Arrays;
import java.util.Scanner;

public class  ZigZagArrays {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int rows=1; rows<=n ; rows++) {
            String[] numbers = scan.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if(rows%2==0){
                secondArray[rows-1]=firstNum;
                firstArray[rows-1]=secondNum;

            }else{
                secondArray[rows-1]=secondNum;
                firstArray[rows-1]=firstNum;
            }
        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}
