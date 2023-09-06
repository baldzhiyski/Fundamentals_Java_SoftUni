import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println(printSmallestNum(arr));
    }
    public static int printSmallestNum(int[] array){
        int minNum = Integer.MAX_VALUE;
        for (int element:array) {
            if (element<minNum){
                minNum=element;
            }
        }
        return minNum;
    }
}
