import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> listOfEl = new ArrayList<>();
        List<String> minorWords = new ArrayList<>();
        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            listOfEl.add(matcher.group("firstWord"));
            listOfEl.add(matcher.group("secondWord"));
        }
        if(listOfEl.size()==0){
            System.out.println("No word pairs found!");
        }else{
            System.out.println(listOfEl.size()/2+ " word pairs found!");
        }
        int countMirrorWords =0;
        for (int i = 0; i < listOfEl.size()-1; i+=2) {
          StringBuilder reverser = new StringBuilder(listOfEl.get(i+1));
          if(listOfEl.get(i).equals(reverser.reverse().toString())){
              countMirrorWords++;
              minorWords.add(listOfEl.get(i) +" <=> " + listOfEl.get(i+1));
          }
        }
        if (countMirrorWords != 0) {
            System.out.println("The mirror words are:");
        System.out.println(String.join(", ",minorWords));
        }else{
            System.out.println("No mirror words!");
        }
    }
}
