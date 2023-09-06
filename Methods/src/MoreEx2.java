import java.util.Scanner;

public class MoreEx2 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int firstX = Integer.parseInt(scan.nextLine());
        int firstY = Integer.parseInt(scan.nextLine());
        int secondX = Integer.parseInt(scan.nextLine());
        int secondY = Integer.parseInt(scan.nextLine());

        int firstPoint = calculateMethod(firstX,firstY);
        int secondPoint = calculateMethod(secondX,secondY);

        printMethod(firstX, firstY, secondX, secondY, firstPoint, secondPoint);

    }

    private static void printMethod(int firstX, int firstY, int secondX, int secondY, int firstPoint, int secondPoint) {
        if(firstPoint <= secondPoint){
            System.out.printf("(%d, %d)", firstX, firstY);
        }else{
            System.out.printf("(%d, %d)", secondX, secondY);
        }
    }

    public static int calculateMethod(int x , int y){
        double distanceToCentre = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return (int) distanceToCentre;
    }
}
