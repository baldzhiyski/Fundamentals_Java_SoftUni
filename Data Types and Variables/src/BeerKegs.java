import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scan.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        for (int i = 1; i <=numberOfKegs ; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume = Math.pow(radius,2)*Math.PI*height;
            if (volume>maxVolume){
                maxVolume=volume;
                maxModel=model;
            }
        }
        System.out.printf("%s",maxModel);
    }
}
