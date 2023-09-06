import java.util.Scanner;

public class AddAndSubtractSecond {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());
        System.out.println(subtract(firstNum,secondNum,thirdNum));

    }
    public static int sum(int n1,int n2){
        return n1+n2;
    }
    public static int subtract(int n1, int n2 , int n3){
        return sum(n1, n2) - n3;
    }
}
