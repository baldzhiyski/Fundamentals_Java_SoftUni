import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numberNums = Integer.parseInt(scan.nextLine());
        int[] numberArr = new int[numberNums];
        for (int i = 0; i <numberArr.length ; i++) {
            numberArr[i] = Integer.parseInt(scan.nextLine());
        }
        for (int j = numberArr.length-1; j >=0 ; j--) {
            System.out.printf("%d ",numberArr[j]);
        }
    }
}
