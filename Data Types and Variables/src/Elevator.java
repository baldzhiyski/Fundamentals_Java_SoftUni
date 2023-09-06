import java.util.Scanner;

public class  Elevator {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        double result = Math.ceil(numberOfPeople*1.0/capacity);
        System.out.printf("%.0f",result);

    }
}
