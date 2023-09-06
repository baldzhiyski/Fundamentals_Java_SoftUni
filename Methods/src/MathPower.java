import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        double firstNum = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathPower(firstNum,power)));
    }
    public static Double mathPower(double num , double power){
        double result =1;
        for (int i = 1; i <=power ; i++) {
            result*=num;
        }
        return  result;
    }
}
