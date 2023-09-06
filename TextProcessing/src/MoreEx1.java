import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoreEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <times ; i++) {
            String input = scan.nextLine();
            List<String> info = returnNameAndAge(input);
            System.out.printf("%s is %s years old.%n",info.get(0),info.get(1));
        }
    }
    public static List<String> returnNameAndAge(String input){
        List<String> resultList = new ArrayList<>();
        int startIndexName= 0;
        int lastIndexName = 0;
        int startIndexAge = 0;
        int lastIndexAge = 0;
        for (char symbol : input.toCharArray()) {
            if(symbol=='@'){
                startIndexName =  input.indexOf(symbol);
            }
            if(symbol=='|'){
                lastIndexName = input.indexOf(symbol);
            }
            if(symbol=='#'){
                startIndexAge=input.indexOf(symbol);
            }
            if(symbol=='*'){
                lastIndexAge=input.indexOf(symbol);
            }

        }
        String name = input.substring(startIndexName + 1,lastIndexName);
        String age = input.substring(startIndexAge + 1,lastIndexAge);
        resultList.add(name);
        resultList.add(age);
        return resultList;

    }
}
