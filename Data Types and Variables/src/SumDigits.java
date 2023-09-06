import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (number>0){
            int lastDigit = number%10;
            sum+=lastDigit;
            number=number/10;
        }
        System.out.println(sum);

        // String numberAsString = number + "";
        // for (int i = 0; i<=numberAsString.length() - 1 ; i++){
        //    char symbol = numberAsString.charAt(i);
        //    int currentNum =  Integer.parseInt(symbol + "");
        //    sum+=currentNum;
        //
    }
}
