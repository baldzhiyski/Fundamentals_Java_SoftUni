import java.util.Scanner;

public class  Train {
    public static void main(String[] args) {
        Scanner scan =   new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] wagon = new int[n];
        int sum = 0;
        for (int i = 0; i <wagon.length ; i++) {
            int numOfPeoplePerWagon = Integer.parseInt(scan.nextLine());
            wagon[i]+=numOfPeoplePerWagon;
            sum+=numOfPeoplePerWagon;
        }
        for (int j : wagon) {
            System.out.print(j + " ");
        }
        System.out.printf("%n%d",sum);
    }
}
