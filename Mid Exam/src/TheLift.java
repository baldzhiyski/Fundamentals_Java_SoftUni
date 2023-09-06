import java.util.Arrays;

import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int howManyPeople = Integer.parseInt(scan.nextLine());
        int[] wagons = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <wagons.length ; i++) {
                while (wagons[i] != 4 && howManyPeople!=0) {
                    howManyPeople--;
                    wagons[i]++;
                }
        }
        boolean isTrue = isValid(wagons);

        if(isTrue && howManyPeople==0){
                printMethod(wagons);
        }else if( hasEmptySpot(wagons) && howManyPeople==0){
            System.out.println("The lift has empty spots!");
            printMethod(wagons);
        }else if (howManyPeople>=1 && isTrue) {
            System.out.printf("There isn't enough space! %d people in a queue!", howManyPeople);
            System.out.println();
            printMethod(wagons);
        }
    }

    private static void printMethod(int[] wagons) {
        for (int wagon: wagons) {
            System.out.print(wagon+" ");
        }
    }
    private static boolean isValid(int[] wagons){
        for (int el:wagons) {
            if(el!=4){
                return false;
            }
        }
        return true;
    }
    private static boolean hasEmptySpot(int[] wagons){
        for (int el:wagons) {
            if(el<4){
                return true;
            }
        }
        return false;
    }
}
