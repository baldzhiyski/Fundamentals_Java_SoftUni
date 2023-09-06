import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        do {
            System.out.printf("%d X %d = %d%n",num1,num2,num1*num2);
            num2++;
        } while (num2<=10);
//        if (num2>10){
//          System.out.printf("%d X %d = %d",num1,num2,num1*num2);
//        }else
//           for(int i = num2 ; num2<=10 ; num2++){
//            System.out.printf("%d X %d = %d%n",num1,num2,(num1*num2));
//           }
//        }
    }
}
