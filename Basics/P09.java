import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for(int i =1; i<=num;i++) {
            int odd = 2*i - 1;
            System.out.println(odd);
            sum+=odd;
        }
        System.out.printf("Sum: %d",sum);
    }
}
