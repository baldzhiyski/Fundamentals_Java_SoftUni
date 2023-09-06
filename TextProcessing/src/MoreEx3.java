import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfNums =Arrays
                .stream(scan.nextLine()
                .split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("find")){
            String lineOfWord = input;
            String resultWord = resultingWord(lineOfWord,listOfNums);
//            String[] type = resultWord.split("&");
            int startIndexOfType = resultWord.indexOf('&') + 1;
            int endIndexOfType = resultWord.indexOf('&',startIndexOfType);
            String type = resultWord.substring(startIndexOfType,endIndexOfType);
            String coordinates = resultWord.substring(resultWord.indexOf("<") + 1 , resultWord.indexOf(">"));

            System.out.printf("Found %s at %s%n",type,coordinates);

            input=scan.nextLine();
        }
    }
    public static String resultingWord(String word,List<Integer> numbers){
        StringBuilder result = new StringBuilder();
        if(word.length()<=numbers.size()){
            for (int i = 0; i <word.length(); i++) {
                char symbol = word.charAt(i);
                symbol-=numbers.get(i);
                result.append(symbol);
            }
        }else{
            int index = 0;
            for (int i = 0; i <word.length(); i++) {
                char symbol = word.charAt(i);
                if(index==numbers.size()){
                    index=0;
                }
                symbol-=numbers.get(index);
                result.append(symbol);
                index++;
            }
        }
        return result.toString();
    }

}
