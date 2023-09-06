import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i <input.length; i++) {
            String currentWord = input[i];
            String repeatWord = repeatString(currentWord);
            resultList.add(repeatWord);
        }
        System.out.println(String.join("",resultList));
    }
    public static String repeatString( String word){
        StringBuilder result = new StringBuilder();
        result.append(word.repeat(word.length()));
        return result.toString();
    }
}
