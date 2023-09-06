import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encryptedMessage = scan.nextLine();
        StringBuilder realMessage = new StringBuilder(encryptedMessage);
        String word = scan.nextLine();
        while(!word.equals("Decode")){
            String[] instruction = word.split("\\|");
            String type = instruction[0];
            switch (type){
                case "Move":
                    int numberOfLetters = Integer.parseInt(instruction[1]);
                    for (int i = 0; i < numberOfLetters ; i++) {
                        char symbolToDelete = realMessage.charAt(0);
                        realMessage.append(symbolToDelete);
                        realMessage.deleteCharAt(0);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(instruction[1]);
                    String toInsert = instruction[2];
                    realMessage.insert(index,toInsert);
                    break;
                case"ChangeAll":
                    String pass = instruction[1];
                    String replacement = instruction[2];
                    String astext = realMessage.toString();
                    int indexx = astext.indexOf(pass);
                    while(indexx!=-1){
                        astext=astext.replace(pass,replacement);
                        indexx=astext.indexOf(pass);
                    }
                    realMessage= new StringBuilder(astext);
                    break;
            }
            word=scan.nextLine();
        }
        System.out.println("The decrypted message is: "+ realMessage);
    }
}
