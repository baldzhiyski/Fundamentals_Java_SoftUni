import java.util.Arrays;
import java.util.Scanner;

public class EqualsSum {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numArrs = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index<=numArrs.length-1;index++){
            int leftSum = 0;
            int rightSum = 0;
            // find the sum of elements on the left
            // leftsum = all elements from first till mine , without included
            for (int leftIndex = 0; leftIndex <index ; leftIndex++) {
                leftSum+=numArrs[leftIndex];
            }
            // find the sum of the right
            for (int rightIndex = index+1; rightIndex <= numArrs.length-1 ; rightIndex++) {
                rightSum+=numArrs[rightIndex];
            }

            //compare the sums
            if(leftSum==rightSum){
                System.out.println(index);
                return; // end the whole programme
            }
        }
        // when we have checked all the nums  and there's no match
        System.out.println("no");
    }
}
