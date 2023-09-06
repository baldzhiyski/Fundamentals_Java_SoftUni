import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] languages = scan.nextLine().split(" ");
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String language: languages) {
             language=language.toLowerCase();
             wordsMap.putIfAbsent(language,0);
             wordsMap.put(language,wordsMap.get(language) + 1);

//            if (wordsMap.containsKey(language)) {
//                wordsMap.put(language,wordsMap.get(language) +1);
//            }else{
//                wordsMap.put(language,1);
//            }


//            if(!wordsMap.containsKey(language)){
//                wordsMap.put(language,0);
//            }
//            wordsMap.put(language,wordsMap.get(language) + 1);

        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if(entry.getValue()%2!=0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",resultList));
    }
}
