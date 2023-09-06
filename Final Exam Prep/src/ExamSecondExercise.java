import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamSecondExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "\\|(?<BossName>[A-Z]{4,})\\|:\\#(?<Tittle>[A-Z][a-z]+ [A-Za-z]+)\\#";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String bossName = matcher.group("BossName");
                String tittle = matcher.group("Tittle");
                System.out.printf("%s, The %s%n",bossName,tittle);
                System.out.println(">> Strength: "+bossName.length());
                System.out.println(">> Armor: "+ tittle.length());
            }else{
                System.out.println("Access denied!");
            }
        }
    }
}
