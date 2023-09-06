import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String value = scan.nextLine();
        switch (value){
            case "int":
                int a = Integer.parseInt(scan.nextLine());
                int b = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(a,b));
                break;
            case "char":
                char first = scan.nextLine().charAt(0);
                char second = scan.nextLine().charAt(0);
                System.out.println(getMax(first,second));
                break;
            case "string":
                String first1 = scan.nextLine();
                String second2 = scan.nextLine();
                System.out.println(getMax(first1,second2));
                break;
        }
    }
    public static int getMax(int a, int b ){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static char getMax(char a, char b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public  static  String getMax(String first , String second){
        if(first.compareTo(second)>=0){
            return first;
        }
            return second;
    }
}
