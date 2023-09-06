import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        BigInteger firstNuM =  new BigInteger(scan.nextLine());
        BigInteger secondNuM =  new BigInteger(scan.nextLine());
        BigInteger sum =  firstNuM.add(secondNuM);

        System.out.println(sum);
    }
}
