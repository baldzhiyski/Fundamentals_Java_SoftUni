import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String elements = scan.nextLine();
        StringBuilder result = new StringBuilder(elements);
        String input = scan.nextLine();
        while(!input.equals("Travel")){
            String[] inputArr = input.split(":");
            String command = inputArr[0];
            switch (command){
                case"Add Stop":
                    int index = Integer.parseInt(inputArr[1]);
                    String stopToAdd = inputArr[2];
                    if (inRange(index, result.toString())) {
                        result.insert(index,stopToAdd);
                    }
                    System.out.println(result);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(inputArr[1]);
                    int endIndex = Integer.parseInt(inputArr[2]);
                    if(inRange(startIndex,result.toString()) && inRange(endIndex,result.toString()) && startIndex<=endIndex){
                        result.delete(startIndex,endIndex+1);
                    }
                    System.out.println(result);
                    break;
                case "Switch":
                    String oldString = inputArr[1];
                    String replacement = inputArr[2];
                    int indexx=result.indexOf(oldString);
                    if(indexx!=-1){
                        result.replace(indexx,indexx+oldString.length(),replacement);
                    }
                    System.out.println(result);
                    break;
            }
            input=scan.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",result);

    }
    public  static boolean inRange(int n ,String input){
        return n>=0 && n<=input.length()-1;
    }
}
