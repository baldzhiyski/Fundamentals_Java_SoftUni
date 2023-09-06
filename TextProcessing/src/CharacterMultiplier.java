import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(" ");
        String firstString = inputArr[0];
        String secondString = inputArr[1];
        int minSize = Math.min(firstString.length(),secondString.length());
        int sum = 0;
        for (int i = 0; i <minSize ; i++) {
            sum+=firstString.charAt(i)*secondString.charAt(i);
        }
        if(firstString.length()>secondString.length()){
            for (int i = minSize ; i <firstString.length() ; i++) {
                sum+=firstString.charAt(i);
            }
        }else{
            for (int i = minSize; i < secondString.length(); i++) {
                sum+=secondString.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
