import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String username =  scan.nextLine();
        String password = "" ;
        for (int position = username.length()-1 ; position>=0 ; position--){
            char currentSymbol = username.charAt(position) ;
            password+=currentSymbol;
        }
        int countWrongPass = 0;
        String password1 = scan.nextLine();
        while(!password1.equals(password)){
            countWrongPass++;
            if (countWrongPass==4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password1=scan.nextLine();
        }
        if(password1.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
