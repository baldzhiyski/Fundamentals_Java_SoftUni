import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String activationKey= scan.nextLine();
        String command = scan.nextLine();
        while(!command.equals("Generate")){
            String[] commandArr =command.split(">>>");
            String word = commandArr[0];
            int startIndex;
            int endIndex ;
            switch (word){
                case "Contains":
                    String substring = commandArr[1];
                    if(activationKey.contains(substring)){
                        System.out.printf("%s contains %s%n",activationKey,substring);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                     startIndex = Integer.parseInt(commandArr[2]);
                     endIndex = Integer.parseInt(commandArr[3]);
                     String subStr = activationKey.substring(startIndex,endIndex);
                    if(commandArr[1].equals("Upper")){
                        activationKey=activationKey.replace(subStr,subStr.toUpperCase());
                    }else{
                        activationKey=activationKey.replace(subStr,subStr.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex =Integer.parseInt(commandArr[1]) ;
                    endIndex = Integer.parseInt(commandArr[2]);
                    String toSlice = activationKey.substring(startIndex,endIndex);
                    activationKey=activationKey.replace(toSlice,"");
                    System.out.println(activationKey);
                    break;
            }
            command=scan.nextLine();
        }
        System.out.println("Your activation key is: "+ activationKey);
    }
}
