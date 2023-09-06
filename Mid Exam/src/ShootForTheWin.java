import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();
        int numOfShotTargets = 0;
        while(!input.equals("End")){
            int index = Integer.parseInt(input);
            if(isInRange(index,numArr)) {
                int shootTarget = numArr[index];
                if (shootTarget != -1) {
                    numOfShotTargets++;
                    numArr[index] = -1;
                    for (int i = 0; i <numArr.length ; i++) {
                        int currentNum = numArr[i];
                        if(currentNum!=-1){
                            if (currentNum > shootTarget) {
                                numArr[i] = currentNum-shootTarget;
                            } else {
                                numArr[i] = currentNum+shootTarget;
                            }
                        }
                    }
                }
            }
            input=scan.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",numOfShotTargets);
        printArray(numArr);
    }
    public static boolean isInRange(int index, int[] numArr){
        return index>=0 && index<numArr.length;
    }
    public static void printArray(int[] arr){
        for (int item: arr) {
            System.out.print(item+ " ");
        }
    }
}
