import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        StringBuilder input = new StringBuilder(scan.nextLine());
        StringBuilder message = new StringBuilder();
        for (int num:numbers) {
            int index;
            int sumDigits=0;
            while(num>0){
                int lastDigit = num%10;
                sumDigits+=lastDigit;
                num/=10;
            }
            index=sumDigits;
            while(index>input.length()){
                index-=input.length();
            }
            char character = input.charAt(index);
            message.append(character);
            input.deleteCharAt(index);
        }
        System.out.println(message);
    }
}
