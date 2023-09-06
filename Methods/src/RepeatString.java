import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(repeatString(n,input));
    }
    public static String repeatString(int n , String word){
        String resultText = "";
        for (int i = 0; i <n ; i++) {
            resultText+=word;
        }
        return  resultText;
    }
}
