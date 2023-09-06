import java.util.Arrays;
import java.util.Scanner;

public class MoreEx2 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numArrs = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int middleIndex = numArrs.length/2;
        double sumLeft = 0;
        double sumRight =0;
        for (int i = 0; i < middleIndex ; i++) {
            sumLeft+=numArrs[i];
            if(numArrs[i] == 0){
                sumLeft*=0.8;
            }
        }
        for (int i = numArrs.length-1; i >middleIndex; i--) {
            sumRight+=numArrs[i];
            if(numArrs[i] == 0){
                sumRight*=0.8;
            }
        }
        if(sumLeft<sumRight){
            System.out.printf("The winner is left with total time: %.1f",sumLeft);
        }else{
            System.out.printf("The winner is right with total time: %.1f",sumRight);
        }
    }
}
