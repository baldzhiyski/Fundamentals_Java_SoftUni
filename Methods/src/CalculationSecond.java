import java.util.Scanner;

public class CalculationSecond {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String action = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        switch (action){
            case "add":
                System.out.println( addMethod(a,b));
                break;
            case "multiply":
                System.out.println( multiplyMethod(a,b));
                break;
            case "subtract":
                System.out.println( substractMethod(a,b));
                break;
            case "divide":
                System.out.println( divideMethod(a,b));
                break;
        }
    }
    public static int substractMethod(int first , int second){
        return Math.abs(first-second);
    }

    public static int divideMethod(int one , int two){
        return  one/two;
    }

    public static int addMethod(int one,int two){
        return  one+two;
    }
    public static int multiplyMethod(int one,int two){
        return  one*two;
    }
}
