import java.util.Scanner;

public class MoreEx1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();
        String value = scan.nextLine();
       printMethod(input,value);
    }
    public static void printMethod(String input,String data) {
        if(input.equals("int")){
            int number = Integer.parseInt(data);
            int result = number*2;
            System.out.println(result);
        }else if(input.equals("real")){
            double number = Double.parseDouble(data);
            double result = number*1.5;
            System.out.printf("%.2f",result);
        }else if(input.equals("string")){
            System.out.printf("$%s$",data);
        }
    }
}
