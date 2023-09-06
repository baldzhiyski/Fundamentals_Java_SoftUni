import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        char symbol = scan.nextLine().charAt(0);

        if(Character.isUpperCase(symbol)){
            System.out.println("upper-case");

//        if (symbol>='A' && symbol<='Z'){
//            System.out.println("upper-case");
//        }else if(symbol>='a' && symbol<='z'){
//            System.out.println("lower-case");
        }else if(Character.isLowerCase(symbol)){
            System.out.println("lower-case");
        }
    }
}
