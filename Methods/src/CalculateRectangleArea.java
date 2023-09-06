import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        System.out.println(calculateArea(length,width));

    }
    public static int calculateArea(int a , int b){
        return a*b;
    }
}
