import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElemetns {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] arrays = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;
        for (int i = 1; i <=arrays.length - 1 ; i++) {
            if (arrays[i] == arrays[i-1]){
                length++;
            }else{
                length=1;
                startIndex=i;
                // when the new sequence starts we need a new Index
            }
            // whether the length  of the sequence is maximal
            if(length>maxLength){
                maxLength=length;
                bestStartIndex=startIndex;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex+maxLength ; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
