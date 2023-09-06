import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String regexSecond = "([:]{2}|[*]{2})(?<emojiName>[A-Z][a-z]{2,})(\\1)"
        String regex = "(\\*\\*|::)(?<emojiName>[A-Z][a-z]{2,})\\1";
        List<String> emojis = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);
        int allValidEmojis = 0;
        BigInteger threshold = BigInteger.ONE;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int digit = Character.getNumericValue(symbol);
                threshold = threshold.multiply(BigInteger.valueOf(digit));
            }
        }
        while(matcher.find()){
            allValidEmojis++;
            String name = matcher.group("emojiName");
            BigInteger sumOfEachName=BigInteger.valueOf(calculateASCIICode(name));
            if(sumOfEachName.compareTo(threshold)>0){
              emojis.add(matcher.group());
            }
        }
        System.out.println("Cool threshold: "+ threshold);
        System.out.printf("%d emojis found in the text. The cool ones are: %n",allValidEmojis);
        System.out.println(String.join(System.lineSeparator(),emojis));

    }
    public static long calculateASCIICode (String word){
        long sum = 0;
        for (char c : word.toCharArray()) {
            sum+=(int) c;
        }
        return sum;
    }

}
