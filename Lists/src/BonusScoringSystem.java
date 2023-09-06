import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countStudents = Integer.parseInt(scan.nextLine());
        int countLectures = Integer.parseInt(scan.nextLine());
        int bonus = Integer.parseInt(scan.nextLine());
        double maxBonus = 0;
        int maxLectures = 0;
        for (int i =0; i <countStudents ; i++) {
            int attendancesOfStudent = Integer.parseInt(scan.nextLine());
            double total = attendancesOfStudent*1.0/countLectures*(5+bonus);
            if(total>maxBonus){
                maxBonus=total;
                maxLectures=attendancesOfStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.%n",Math.ceil(maxBonus),maxLectures);
    }
}
