import java.util.Scanner;

public class Exam_First_Ex {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double pricePerFlour = Double.parseDouble(scan.nextLine());
        double pricePerEgg = Double.parseDouble(scan.nextLine());
        double pricePerApron = Double.parseDouble(scan.nextLine());
        int freepackages =0;
        for (int i = 1; i <=students ; i++) {
            if(i%5==0){
                freepackages++;
            }
        }
        double wholeSum=pricePerApron*Math.ceil(1.2*students)+pricePerEgg*10*students+pricePerFlour*(students-freepackages);

        if(budget>=wholeSum){
            System.out.printf("Items purchased for %.2f$.",wholeSum);
        }else{
            System.out.printf("%.2f$ more needed.",Math.abs(budget-wholeSum));
        }
    }
}
