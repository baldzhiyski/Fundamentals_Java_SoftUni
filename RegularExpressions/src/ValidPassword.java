import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = Integer.parseInt(scan.nextLine());
        String regex = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= n; i++) {
            String password = scan.nextLine();
            Matcher matcher = pattern.matcher(password);
            if(matcher.find()){
                String text = matcher.group("passwordText");
                StringBuilder category = calculateMethod(text);
                if(category.length()==0){
                    System.out.println("Group: default");
                }else{
                    System.out.println("Group: " + category);
                }
            }else{
                System.out.println("Invalid pass!");
            }
        }
    }

    private static StringBuilder calculateMethod(String text) {
       StringBuilder result = new StringBuilder();
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                result.append(symbol);
            }
        }
        return result;
    }
}
