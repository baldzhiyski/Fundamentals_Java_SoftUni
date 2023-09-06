import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String[] names ={"Peter", "Michell", "Jane", "Steve "};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns= {"stones","cake","apple","laptop","bikes"};
        String[] adverbs ={"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        System.out.println("Hello, this is your first random generated sentence.");
        while (true){
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);
            System.out.printf("%s from %s %s %s %s %s.%n",randomName,randomPlace,randomVerb,randomNoun,randomAdverb,randomDetail);
            System.out.println("Do u wanna continue playing ? Press yes or no : ");
            String command = scan.nextLine();
            if(command.equals("no")){
                return;
            }
        }

    }
    public static String getRandomWord(String[] words){
        Random random =new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }

}
