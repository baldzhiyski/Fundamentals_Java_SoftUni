import java.util.Arrays;
import java.util.Scanner;

public class MoreEx1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        int[] numberArr = new int[lines];
        for (int i =0; i <numberArr.length ; i++) {
            String name = scan.nextLine();
            int sum = 0;
            for (int j = 0; j <name.length() ; j++) {
                char symbol = name.charAt(j);
                if(symbol=='a' || symbol=='i' || symbol=='o' || symbol=='e' || symbol=='u' || symbol=='A'
                || symbol=='U' || symbol=='O' || symbol=='I' || symbol=='E'){
                    sum+= (int) symbol *name.length();
                }else{
                   sum+=(int) symbol/name.length();
                }
            }
            numberArr[i] = sum;
        }
        Arrays.sort(numberArr);
        for(int i :numberArr){
            System.out.println(i);
        }
    }
}
