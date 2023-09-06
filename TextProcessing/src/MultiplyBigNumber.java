import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();

        BigInteger firstNum = new BigInteger(first);
        int secondNum = Integer.parseInt(second);

        System.out.println(firstNum.multiply(BigInteger.valueOf(secondNum)));
    }
}
