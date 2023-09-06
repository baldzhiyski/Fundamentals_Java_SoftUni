import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String action = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        switch (action){
            case "add":
                addMethod(a,b);
                break;
            case "multiply":
                multiplyMethod(a,b);
                break;
            case "subtract":
                substractMethod(a,b);
                break;
            case "divide":
                divideMethod(a,b);
                break;
        }
    }
    public static void substractMethod(int first , int second){
        int result = Math.abs(first-second);
        System.out.println(result);
    }

    public static void divideMethod(int one , int two){
        int result = one/two;
        System.out.println(result);
    }

    public static void addMethod(int one,int two){
        int result = one+two;
        System.out.println(result);
    }
    public static void multiplyMethod(int one,int two){
        int result =one*two;
        System.out.println(result);
    }

}
