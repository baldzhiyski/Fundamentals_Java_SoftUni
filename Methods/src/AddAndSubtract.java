import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(scan.nextLine());
        }
        printResult(arr);

    }
    public static void printResult(int[] array){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = array[0] + array[1];
        }
        int result = sum-array[2];
        System.out.println(result);
    }
}
