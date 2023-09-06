import java.util.Scanner;

public class MoreExSecondAttempt22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get the number of lines as input
        int n = Integer.parseInt(scanner.nextLine());
        // loop through each line
        for (int i = 0; i < n; i++) {
            // get the two numbers as strings
            String[] numbers = scanner.nextLine().split(" ");
            // convert them to long values
            long firstNum = Long.parseLong(numbers[0]);
            long secondNum = Long.parseLong(numbers[1]);
            // initialize the sum of digits to zero
            int sumOfDigits = 0;
            // compare the two numbers
            if (firstNum > secondNum) {
                // if the left number is greater, get the absolute value of it
                firstNum = Math.abs(firstNum);
                // loop through each digit of the left number
                while (firstNum > 0) {
                    // add the last digit to the sum of digits
                    sumOfDigits += firstNum % 10;
                    // remove the last digit from the left number
                    firstNum /= 10;
                }
            } else {
                // if the right number is greater or equal, get the absolute value of it
                secondNum = Math.abs(secondNum);
                // loop through each digit of the right number
                while (secondNum > 0) {
                    // add the last digit to the sum of digits
                    sumOfDigits += secondNum % 10;
                    // remove the last digit from the right number
                    secondNum /= 10;
                }
            }
            // print the sum of digits
            System.out.println(sumOfDigits);
        }
    }
}