import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder concealedMessage = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();
        while(!input.equals("Reveal")){
            String[] inputArr = input.split(":\\|:");
            String command = inputArr[0];
            if(command.equals("InsertSpace")){
                int indexToInsert = Integer.parseInt(inputArr[1]);
                concealedMessage.insert(indexToInsert," ");
                System.out.println(concealedMessage);
            }else if(command.equals("Reverse")){
                String substring = inputArr[1];
                if(concealedMessage.toString().contains(substring)){
                  int startIndex = concealedMessage.indexOf(substring);
                  concealedMessage.delete(startIndex,startIndex+substring.length());
                  StringBuilder reverser = new StringBuilder(substring);
                  concealedMessage.append(reverser.reverse());
                  System.out.println(concealedMessage);
                }else{
                    System.out.println("error");
                }
            }else if(command.equals("ChangeAll")){
                String wordToChange = inputArr[1];
                String replacement = inputArr[2];
                concealedMessage = changeBuilder(wordToChange,replacement,concealedMessage);
                System.out.println(concealedMessage);
            }
            input=scan.nextLine();
        }
        System.out.println("You have a new text message: " + concealedMessage);
    }
    public static StringBuilder changeBuilder(String wordToChange,String replacement, StringBuilder concealedMessage){
        concealedMessage = new StringBuilder(concealedMessage.toString().replaceAll(wordToChange,replacement));
        return concealedMessage;
    }
}
