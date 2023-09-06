import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        score(grade);
    }
    public static void score(double score){
        String result = "";
        if(score<=2.99){
            result="Fail";
        }else if(score<=3.49){
            result="Poor";
        }else if(score<=4.49){
            result="Good";
        }else if(score<=5.49){
            result="Very good";
        }else{
            result="Excellent";
        }
        System.out.println(result);
    }
}
