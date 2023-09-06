import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "(@#+)(?<barcodeName>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            Matcher matcher = pattern.matcher(word);
            StringBuilder result = new StringBuilder();
            if(matcher.find()){
                result.append(matcher.group("barcodeName"));
                calculateMethod(result);
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
    public static void calculateMethod(StringBuilder result ){
        StringBuilder lastOne = new StringBuilder();
        int digits = 0;
        for (char symbol : result.toString().toCharArray()) {
            if(Character.isDigit(symbol)){
                lastOne.append(symbol);
                digits++;
            }
        }
        if(digits==0){
            System.out.println("Product group: 00");
        }else{
            System.out.println("Product group: " + lastOne);
        }
    }
}
