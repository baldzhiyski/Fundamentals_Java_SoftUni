import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        // a b c d e
        String[] inputArr = scan.nextLine().split(" ");
        for (int i = 0; i <inputArr.length / 2 ; i++) {
            String oldElement = inputArr[i]; //a
            inputArr[i]=inputArr[inputArr.length-1 - i];
            inputArr[inputArr.length-1 - i]=oldElement;
        }
        System.out.println(String.join(" ",inputArr));
    }
}
