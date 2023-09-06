import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String[] wordSArr= scan.nextLine().split(" ");
        Random random = new Random();
        for (int i = 0; i < wordSArr.length ; i++) {
            int index1 = random.nextInt(wordSArr.length);
            int index2 = random.nextInt(wordSArr.length);

            String oldWord = wordSArr[index1];
            wordSArr[index1]= wordSArr[index2];
            wordSArr[index2]= oldWord;
        }
        System.out.println(String.join(System.lineSeparator(),wordSArr));

    }
}
