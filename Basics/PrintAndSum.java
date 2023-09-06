import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = num1 ; i<=num2 ; i++){
            sum+=i;
            System.out.print(i + " ");
        }
        System.out.printf("%nSum: %d",sum);
    }
}
