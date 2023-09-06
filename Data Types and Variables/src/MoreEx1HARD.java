import java.util.Scanner;

public class MoreEx1HARD {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equals("END")){
            String type = "";
            if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
                type="boolean";
            }else if(input.length() == 1 ){
                char symbol = input.charAt(0);
                if(symbol<45 || symbol>57) {
                    type = "character";
                }else{
                    type = "integer";
                }
            }else {
                boolean isString = false;
                boolean isFloat = false;
                for (int i = 0; i <input.length() ; i++) {
                    char currentSymbol = input.charAt(i);
                    //Whether it is symbol or not
                    if(currentSymbol<45 || currentSymbol>57) {
                        isString=true;
                    }
                    if(currentSymbol==46){
                        isFloat=true;
                    }

                }
                if (isString){
                    type = "string";
                }else{
                    if (isFloat){
                        type="floating point";
                    }else{
                        type = "integer";
                    }
                }
            }
            System.out.printf("%s is %s type%n",input,type);
            input=scan.nextLine();
        }

    }
}
