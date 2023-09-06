import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).
                toArray();
        int[] secondArr =Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).
                toArray();
        int sum = 0;
        int diffIndex = -1;
        for (int i = 0; i <firstArr.length ; i++) {
            int currentNumFirst = firstArr[i];
            int currentNumSecond = secondArr[i];

            if(currentNumFirst==currentNumSecond){
                sum+=currentNumFirst;
            }else{
                diffIndex=i;
                break;
            }

        }
        if(diffIndex==-1){
            System.out.printf("Arrays are identical. Sum: %d%n",sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.",diffIndex);
        }
    }
}
