import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int second = Integer.parseInt(scan.nextLine());
        switch (operator){
            case "+":
                System.out.println(addMethod(first,second));
                break;
            case "*":
                System.out.println(multiplyMethod(first,second));
                break;
            case "-":
                System.out.println(substractMethod(first,second));
                break;
            case "/":
                System.out.println(divideMethod(first,second));
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
