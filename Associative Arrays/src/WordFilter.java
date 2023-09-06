import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrays = Arrays.stream(scan.nextLine().split(" ")).filter(w->w.length()%2==0).toArray(String[]::new);
        System.out.println(String.join(System.lineSeparator(),arrays));
    }
}
