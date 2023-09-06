import java.util.Scanner;

public class PadawnEquipmetn {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightsabers = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());
        double sumLight = Math.ceil(1.1*numberOfStudents) * priceOfLightsabers;
        double sumRobes = numberOfStudents*priceOfRobes;
        double sumBelts = (numberOfStudents - numberOfStudents /6) * priceOfBelts;
        double totall = sumLight+sumRobes+sumBelts;
        if (totall<=money){
            System.out.printf("The money is enough - it would cost %.2flv.",totall);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(totall-money));
        }
    }
}
