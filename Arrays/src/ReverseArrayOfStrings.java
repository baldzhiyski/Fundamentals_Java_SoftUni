import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(" ");
        for (int i = inputArr.length-1; i >=0; i--) {
            System.out.print(inputArr[i] + " ");
        }
    }
}
