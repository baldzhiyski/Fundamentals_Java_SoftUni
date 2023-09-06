import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String , ArrayList<String>> wordsMap = new LinkedHashMap<>();
        for (int i = 1; i <=n ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if(!wordsMap.containsKey(word)){
                wordsMap.put(word,new ArrayList<>());
            }
//            wordsMap.putIfAbsent(word,new ArrayList<>());
//
            wordsMap.get(word).add(synonym);
        }
        wordsMap.entrySet().forEach(stringArrayListEntry -> {
            System.out.printf("%s - %s%n",stringArrayListEntry.getKey(),String.join(", ",stringArrayListEntry.getValue()));
        });
    }
}
