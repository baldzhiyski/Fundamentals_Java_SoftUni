import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        StringBuilder newPass = new StringBuilder(word);
        String command = scan.nextLine();
        while(!command.equals("Done")){
            if(command.contains("TakeOdd")){
                StringBuilder newWord = new StringBuilder();
                for (int i = 1; i <=newPass.toString().toCharArray().length-1; i+=2) {
                    newWord.append(newPass.charAt(i));
                }
                newPass=new StringBuilder(newWord.toString());
                System.out.println(newPass);
            }else{
                String[]commandArr = command.split("\\s+");
                if(commandArr[0].equals("Cut")){
                    int index = Integer.parseInt(commandArr[1]);
                    int length = Integer.parseInt(commandArr[2]);
                    newPass.delete(index,index+length);
                    System.out.println(newPass);
                }else if (commandArr[0].equals("Substitute")){
                    String substring = commandArr[1];
                    String replacement = commandArr[2];

                    if(newPass.toString().contains(substring)){
                        newPass= new StringBuilder(newPass.toString().replaceAll(substring,replacement));
                        System.out.println(newPass);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                }
            }
            command=scan.nextLine();
        }
        System.out.println("Your password is: "+ newPass);
    }
}
