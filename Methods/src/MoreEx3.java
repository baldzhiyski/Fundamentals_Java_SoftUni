import java.util.Scanner;

public class MoreEx3 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int firstX = Integer.parseInt(scan.nextLine());
        int firstY = Integer.parseInt(scan.nextLine());
        int secondX = Integer.parseInt(scan.nextLine());
        int secondY = Integer.parseInt(scan.nextLine());
        int thirdX = Integer.parseInt(scan.nextLine());
        int thirdY = Integer.parseInt(scan.nextLine());
        int forthX = Integer.parseInt(scan.nextLine());
        int forthY = Integer.parseInt(scan.nextLine());

        double firstLine = calculateLineMethod(firstX,firstY,secondX,secondY);
        double secondLine = calculateLineMethod(thirdX,thirdY,forthX,forthY);

        if(firstLine>=secondLine){
            printLine(firstX,firstY,secondX,secondY);
        }else{
            printLine(thirdX,thirdY,forthX,forthY);
        }
    }
    public static double calculateLineMethod(int x1 , int y1, int x2 , int y2 ){
        return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
    public static void printLine(int x,int y , int x2 , int y2){
        double distance1 = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double distance2 = Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2));
        if(distance1>=distance2){
            System.out.printf("(%d, %d)(%d, %d)",x2,y2,x,y);
        }else{
            System.out.printf("(%d, %d)(%d, %d)",x,y,x2,y2);
        }
    }
}
