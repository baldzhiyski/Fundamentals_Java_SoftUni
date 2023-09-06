import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int number = 8; number <=n ; number++) {
            // whether it is top or not
            // contains one digit that can not be divided by 2
            // sum of digits should be dividable by 8
            boolean dividableByEight = dividableByEight(number);
            if (dividableByEight ){
                boolean checkForOddDigit = checkForOddDigit(number);
                if(checkForOddDigit){
                    System.out.println(number);
                }
            }
        }
    }
    // first method to check if sum of its digits is dividable by 8
    public  static boolean dividableByEight(int num){
        int sum = 0;
        while (num>0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num/=10;
        }
      //  if(sum%8==0){
        //     return true;
        //return false;
        return sum%8==0;
    }
    public static boolean checkForOddDigit (int num){
        while (num>0){
            int lastDigit = num%10;
            if(lastDigit%2!=0){
                return true;
            }else{
                num/=10;
            }
        }
        return false;
    }
}
