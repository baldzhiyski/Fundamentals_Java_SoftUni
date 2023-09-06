import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(", ");
        List<String> resultList = new ArrayList<>();
        for (String word : inputArr) {
            if(word.length()>=3 && word.length()<=16) {
                boolean addWord = true;
                for (char symbol : word.toCharArray()) {
                    if (!Character.isLetterOrDigit(symbol) && symbol != 45 && symbol != 95) {
                        addWord = false;
                        break;
                    }
                }
                if (addWord) {
                    resultList.add(word);
                }
            }
        }
        System.out.println(String.join(System.lineSeparator(),resultList));
    }
}
