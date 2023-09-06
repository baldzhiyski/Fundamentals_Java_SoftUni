import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<attackType>[A-Za-z]+)![^@!:>-]*->(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nonDecryptedMessage = scan.nextLine();
            String decryptedMessage  = decryptedMessage(nonDecryptedMessage);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if(matcher.find()){
                if(matcher.group("attackType").equals("D")){
                    destroyedPlanets.add(matcher.group("planet"));
                }else if(matcher.group("attackType").equals("A")){
                  attackedPlanets.add(matcher.group("planet"));
                }
            }

        }
        Collections.sort(attackedPlanets);
        System.out.println("Attacked planets: "+ attackedPlanets.size());
        attackedPlanets.forEach(planet-> System.out.println("-> "+ planet));
        Collections.sort(destroyedPlanets);
        System.out.println("Destroyed planets: "+ destroyedPlanets.size());
        destroyedPlanets.forEach(planet-> System.out.println("-> "+ planet));
    }
    public static String decryptedMessage (String nonDecryptedMessage){
        StringBuilder result = new StringBuilder();
        int times = 0;
        for (char symbol : nonDecryptedMessage.toLowerCase().toCharArray()) {
            if(symbol=='a' || symbol=='s' || symbol=='t' || symbol=='r'){
                times++;
            }
        }
        for (char symbol : nonDecryptedMessage.toCharArray()) {
            symbol-=times;
            result.append(symbol);
        }
        return  result.toString();
    }
}
