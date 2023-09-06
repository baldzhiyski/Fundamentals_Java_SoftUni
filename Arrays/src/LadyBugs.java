import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] field = new int[fieldSize];
        int[] ladyBugsIndexes = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index:ladyBugsIndexes) {
            if(index>=0 && index<=field.length-1){
                field[index]=1;
            }
        }
        String command = scan.nextLine();
        while(!command.equals("end")){
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if(index>=0 && index<=field.length-1 && field[index]==1){
                field[index] = 0;
                if(direction.equals("right")){
                    index+=flyLength;


                    while(index<=field.length-1 && field[index]==1){
                        index+=flyLength;
                    }

                    if(index<=field.length-1){
                        field[index]=1;

                    }
                }else if(direction.equals("left")){
                    index-=flyLength;
                    while(index>=0 && field[index]==1){
                        index-=flyLength;
                    }
                    if(index>=0){
                        field[index]=1;
                    }
                }
            }
            command=scan.nextLine();
        }
        for (int number:field ) {
            System.out.print(number+ " ");
        }
    }
}
