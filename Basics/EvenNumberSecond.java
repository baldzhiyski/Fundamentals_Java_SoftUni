import java.util.Scanner;

public class EvenNumberSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        while(num%2!=0){
            System.out.println("Please write an even number.");
            num=Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d",Math.abs(num));
    }
}
