import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNum {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numArrs = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensedArr = new int[numArrs.length-1];
        for (int i = 0; i <numArrs.length ; i++) {
            if(numArrs.length==1){
                break;
            }
            if (i==numArrs.length-1){
                int[] condensedNew = new int[condensedArr.length-1];
                i = -1;
                numArrs=condensedArr;
                condensedArr=condensedNew;
            }else{
                condensedArr[i] = numArrs[i] + numArrs[i+1];
            }
        }
        System.out.println(numArrs[0]);

    }
}
