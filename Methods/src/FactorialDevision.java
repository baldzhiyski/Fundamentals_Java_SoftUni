import java.util.Scanner;

public class FactorialDevision {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        long factFirstNum = calculateFactorialOfNum(firstNum);
        long factSecondNum = calculateFactorialOfNum(secondNum);

        System.out.printf("%.2f",factFirstNum*1.0/factSecondNum);
    }
    public static long calculateFactorialOfNum(int number){
        long factorial = 1;
        for (int i = 1; i <=number ; i++) {
            factorial*=i;
        }
        return factorial;
    }
}
