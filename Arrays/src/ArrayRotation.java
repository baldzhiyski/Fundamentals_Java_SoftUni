import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
            String[] arrays = scan.nextLine().split(" ");
            int countRotation = Integer.parseInt(scan.nextLine());
        for (int rotation = 1; rotation <=countRotation ; rotation++) {
            //array's rotation
             // taking the first Element
            String firstElement = arrays[0];

            //moving the elements to the left
            // ["51" "47" "32" "61" "21"] -> ["47" "32" "61" "21" "21"]
            for(int index = 0; index<arrays.length-1;index++){
                arrays[index]=arrays[index+1];
            }
            //putting the first element in the last place
            arrays[arrays.length-1] = firstElement;
        }
        // we are ready to print
        for(String element: arrays){
            System.out.print(element + " ");
        }
    }
}
