import java.util.Scanner;

public class LeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get the number of lines as input
        int n = Integer.parseInt(scanner.nextLine());

        // loop through each line
        for (int i = 0; i < n; i++) {
            // get the two numbers as a single string
            String line = scanner.nextLine();
            int spaceIndex = line.indexOf(' ');
            // extract the left and right numbers as strings
            String leftNumStr = line.substring(0, spaceIndex);
            String rightNumStr = line.substring(spaceIndex + 1);

            // convert the left and right numbers to long values
            long leftNum = Long.parseLong(leftNumStr);
            long rightNum = Long.parseLong(rightNumStr);

            // calculate the sum of digits for each number
            int leftSumOfDigits = getSumOfDigits(leftNum);
            int rightSumOfDigits = getSumOfDigits(rightNum);

            // compare the two numbers and print the sum of digits accordingly
            if (leftNum > rightNum) {
                System.out.println(leftSumOfDigits);
            } else {
                System.out.println(rightSumOfDigits);
            }
        }
    }

    // Helper method to calculate the sum of digits in a number
    private static int getSumOfDigits(long num) {
        num = Math.abs(num); // Get the absolute value of the number
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }
}
