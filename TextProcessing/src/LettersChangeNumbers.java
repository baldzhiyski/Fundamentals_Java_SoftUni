import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] codes= input.split("\\s+");
        double sum = 0;
        for (String code : codes) {

            double modifiedNum = getModifiedNumber(code) ;
            sum+=modifiedNum;

        }
        System.out.printf("%.2f",sum);
    }

    private static double getModifiedNumber(String code) {
        char letterBefore = code.charAt(0);
        char letterAfter = code.charAt(code.length()-1);
        double num = Double.parseDouble(code.replace(letterBefore,' ').replace(letterAfter,' ').trim());


        if(Character.isUpperCase(letterBefore)){
            int positionUpperLetter = (int) letterBefore - 64;
            num/=positionUpperLetter;

        }else{
            int positionLowerCase = (int) letterBefore - 96;
            num*=positionLowerCase;
        }

        if (Character.isUpperCase(letterAfter)) {
            int positionUpperLetter = (int) letterAfter - 64;
            num-=positionUpperLetter;
        }else{
            int positionLowerCase = (int) letterAfter - 96;
            num+=positionLowerCase;
        }
        return num;
    }
}
