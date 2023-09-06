import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int [] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         int targetSum = Integer.parseInt(scan.nextLine());

         //Обхождаме всички числа
        for (int index = 0; index <=numbers.length-1 ; index++) {
            int currentNum = numbers[index];
            //Обхождаме всички числа след него
            for (int i = index+1; i <=numbers.length-1 ; i++) {
                int nextNum = numbers[i];
                if(nextNum+currentNum==targetSum){
                    System.out.println(currentNum + " " + nextNum );
                }
            }
        }
    }
}
