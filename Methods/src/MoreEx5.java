import java.util.Scanner;

public class MoreEx5 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());
        boolean isZero = isZero(firstNum,secondNum,thirdNum);
        if(isZero){
            System.out.println("zero");
        }else{
            System.out.println( getProductSign(firstNum,secondNum,thirdNum));
        }

    }
    public static String getProductSign(int num1 , int num2, int num3){
        int negativeCount= 0;
        if(num1<0){
            negativeCount++;
        }
        if(num2<0){
            negativeCount++;
        }
        if(num3<0){
            negativeCount++;
        }

        if(negativeCount%2==0 ){
            return "positive";
        }else{
            return "negative";
        }
    }
    public static boolean isZero(int num1,int num2, int num3){
        return (num1==0 || num2==0 || num3==0);
    }
}
