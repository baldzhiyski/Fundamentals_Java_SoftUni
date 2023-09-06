import java.util.Scanner;


public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split("[\\\\.]+");
        System.out.printf("File name: %s%nFile extension: %s%n",inputArr[inputArr.length-2],inputArr[inputArr.length-1]);
    }
}
