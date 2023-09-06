import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfNum {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        BigDecimal sum = new BigDecimal(0);
        int times = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=times ; i++) {
            BigDecimal currentNum = new BigDecimal(scan.nextLine());
            sum = sum.add(currentNum);
        }
        System.out.println(sum);
    }
}
