import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;
        int middleNum = 0;
        for (int i = 1; i <=3 ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            middleNum+=num;
            if (num>maxnum){
                maxnum=num;
            }
            if (num<minnum){
                minnum=num;
            }
        }
        System.out.printf("%d%n%d%n%d",maxnum,middleNum-maxnum-minnum,minnum);
    }
    //double max = Math.max(Math.max(number1, number2), number3);
    //        double min = Math.min(Math.min(number1, number2), number3);
    //        double middle = number1 + number2 + number3 - max - min;
}
