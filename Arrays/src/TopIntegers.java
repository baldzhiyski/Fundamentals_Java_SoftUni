import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //the last element is always a top number. We don't need to incude it.
        for (int index = 0; index <numbers.length-1; index++) {
            int currentNum = numbers[index];
            boolean isBigger = true;
            //true -> the num is bigger than the others on the right
            //false-> the num is not bigger , so we do not print it
            for (int i = index+1; i <=numbers.length-1 ; i++) { //all elements
                int numberAfter = numbers[i];
                if(currentNum<=numberAfter){
                    isBigger=false;
                    break;
                }
            }
            if(isBigger){
                //the number was bigger than the others -> top num
                System.out.print(currentNum+ " ");
            }
        }
        System.out.print(numbers[numbers.length-1]);


    }
}
