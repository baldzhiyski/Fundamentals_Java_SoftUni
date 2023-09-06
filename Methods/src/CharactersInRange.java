import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);
        printAllSymbols(firstSymbol,secondSymbol);

    }
    public static void printAllSymbols(char first , char last){
        if(first<last){
            for (  int i= first + 1; i <last ; i++){ //( char symbol i = (char) (first +1)
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = last + 1; i <first; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
