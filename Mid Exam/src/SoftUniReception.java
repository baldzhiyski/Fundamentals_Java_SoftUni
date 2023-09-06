import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
       int firstEmployeeCapacity = Integer.parseInt(scan.nextLine());
       int secondEmployeeCapacity= Integer.parseInt(scan.nextLine());
       int thirdEmployeeCapacity = Integer.parseInt(scan.nextLine());
       int studentsCount = Integer.parseInt(scan.nextLine());
        int sumOfEmployees = firstEmployeeCapacity+secondEmployeeCapacity+thirdEmployeeCapacity;
       int hours = 0;
       int allHours=0;
       while (studentsCount >0){
           allHours++;
           hours++;
           if(hours==4){
               hours=0;
               continue;
           }
           studentsCount-=sumOfEmployees;
       }
        System.out.printf("Time needed: %dh.",allHours);
    }
}
