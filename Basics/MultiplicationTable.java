import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1 ; i<=10 ; i++){
            System.out.printf("%d X %d = %d%n",num,i,(num*i));
        }
    }
}
