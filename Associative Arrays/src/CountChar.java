import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine().replaceAll("\\s+","");
            LinkedHashMap<Character, Integer> symbolsCount = new LinkedHashMap<>();
            for (char symbol : text.toCharArray()) {
                symbolsCount.putIfAbsent(symbol,0);
                symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);
            }
            symbolsCount.entrySet().forEach(characterIntegerEntry -> System.out.printf("%s -> %d%n"
                    , characterIntegerEntry.getKey(), characterIntegerEntry.getValue()));
    }
}
