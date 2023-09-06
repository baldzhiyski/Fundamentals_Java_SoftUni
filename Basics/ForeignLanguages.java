import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean isEnglish = input.equals("USA") || input.equals("England") ;
        boolean isSpanish = input.equals("Spain") || input.equals("Argentina") || input.equals("Mexico");
        if (isEnglish){
            System.out.println("English");

        }else if (isSpanish){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
// We can do the same witch switch(input)
// case "USA":
// case "England":
//....