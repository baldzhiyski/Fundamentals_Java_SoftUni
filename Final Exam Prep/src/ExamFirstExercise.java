import java.util.Scanner;

public class ExamFirstExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String receivedString = scan.nextLine();
        String input = scan.nextLine();
        while(!input.equals("Finish")){
            String[] inputArr = input.split("\\s+");
            switch (inputArr[0]){
                case "Replace":
                    String symbolToReplace = inputArr[1];
                    String replacementChar = inputArr[2];
                    receivedString=receivedString.replaceAll(symbolToReplace,replacementChar);
                    System.out.println(receivedString);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(inputArr[1]);
                    int endIndex = Integer.parseInt(inputArr[2]);
                    if (isValid(startIndex, endIndex, receivedString)) {
                        receivedString=receivedString.substring(0,startIndex) + receivedString.substring(endIndex+1);
                          System.out.println(receivedString);
                    }else{
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    if(inputArr[1].equals("Upper")){
                        receivedString=receivedString.toUpperCase();
                        System.out.println(receivedString);
                    }else{
                        receivedString=receivedString.toLowerCase();
                        System.out.println(receivedString);
                    }
                    break;
                case "Check":
                    String stringToCheck = inputArr[1];
                    if(receivedString.contains(stringToCheck)){
                        System.out.println("Message contains "+ stringToCheck);
                    }else{
                        System.out.println("Message doesn't contain "+ stringToCheck);
                    }
                    break;
                case "Sum":
                    int startIndexSecond = Integer.parseInt(inputArr[1]);
                    int endIndexSecond = Integer.parseInt(inputArr[2]);
                    if(isValid(startIndexSecond,endIndexSecond,receivedString)){
                        String word = receivedString.substring(startIndexSecond,endIndexSecond+1);
                        calculateMethod(word);
                    }else{
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            input=scan.nextLine();
        }
    }
    public static boolean isValid(int firstIndex , int endIndex, String word){
        return firstIndex>=0 && endIndex<=word.length()-1 && firstIndex<=endIndex;
    }
    public static void calculateMethod(String substring){
        int sum = 0;
        for (char c : substring.toCharArray()) {
            sum+=c;
        }
        System.out.println(sum);
    }
}
