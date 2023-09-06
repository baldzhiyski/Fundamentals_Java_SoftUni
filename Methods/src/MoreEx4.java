import java.util.Scanner;

public class MoreEx4 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        printMethod(num);

    }
    public static void printMethod(int num){
        int[] array = new int[num];
        if(num>0) {
            array[0] = 1;
        }
        if(num>1){
            array[1]=1;
        }
        if(num>2){
            array[2]=2;
        }
        for (int i = 3; i <num ; i++) {
            array[i]=array[i-2] + array[i-1] + array[i-3];
        }
        for (int element:array) {
            System.out.print(element+ " ");
        }
    }
}
