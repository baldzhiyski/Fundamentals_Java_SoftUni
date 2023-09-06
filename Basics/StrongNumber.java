import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int startNumber = number;
        int sumFact = 0;
        while(number>0){
            int lastDigit = number%10; // we take the last
            // We need now the Factorial
            int fact = 1; // Factorial - We need one , because  it won't  make a change
            // We make for cycle so that we can count the Factorial of the last Digit and so for all numbers
            for (int i = 1; i <=lastDigit ; i++) {
                fact=fact * i;
            }
            sumFact+=fact;
            number = number/10 ; // we remove the last digit, so that we have a new number
        }
        //Whether the number is strong or not
        if (sumFact==startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
