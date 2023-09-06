import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = 0;
        int left = 0;
        int yild = Integer.parseInt(scan.nextLine());
        while(yild>=100){
            left+=yild-26;
            yild-=10;
            days++;
        }
        System.out.println(days);
        if(left>=26){
            left-=26;
        }
        System.out.println(left);

    }
}
