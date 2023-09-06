import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        boolean checkLength = checkLength(password);
        if(!checkLength){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean checkContent = checkContent(password);
        if(!checkContent){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean checkDigitsNum = checkDigitsNum(password);
        if(!checkDigitsNum){
            System.out.println("Password must have at least 2 digits");
        }
        if(checkLength && checkContent && checkDigitsNum){
            System.out.println("Password is valid");
        }

    }
    public static boolean checkLength(String password){
        if(password.length()>=6 && password.length()<=10){
            return true;
        }
        return false;
    }

    public static boolean checkContent(String password){
        ///// Logic
        for (char symbol:password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkDigitsNum(String password){
        //// Logic
        int countDigits = 0;
        for (char symbols : password.toCharArray()) {
            if(Character.isDigit(symbols)){
                countDigits++;
            }
        }
        return countDigits >= 2;
    }

}
