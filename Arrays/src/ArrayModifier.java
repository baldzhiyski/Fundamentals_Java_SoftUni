import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // повтарящо се условие
        //стоп:входни данни = "end "
        //продължаваме : входни данни != " еnd  "
        String command = scan.nextLine();
        while(!command.equals("end")){
            // command = "swap 2 4 "
            if(command.contains("swap")){
                    int index1 =Integer.parseInt(command.split(" ")[1]);  // parse ("2") -> 2
                    int index2 = Integer.parseInt(command.split(" ")[2]);// parse("4") -> 4
                    int firstIndexNum = numbers[index1];
                    int secondIndexNum = numbers[index2];
                numbers[index1] = secondIndexNum;
                numbers[index2] = firstIndexNum;
            }else if(command.contains("multiply")){
                // multiply 3 6
                int index1 =Integer.parseInt(command.split(" ")[1]);  // parse ("3") -> 3
                int index2 = Integer.parseInt(command.split(" ")[2]);// parse ("6") -> 6
                int firstIndexNum = numbers[index1];
                int secondIndexNum = numbers[index2];
                int product = firstIndexNum*secondIndexNum;
                numbers[index1]=product;
            }else if(command.equals("decrease")){
                test(numbers);
            }
            command= scan.nextLine();
        }
        System.out.println(Arrays.toString(numbers).replace("[", "")
                .replace("]", ""));
    }

    private static void test(int[] numbers) {
        for (int i = 0; i <= numbers.length -1 ; i++) {
            numbers[i]--;
            //number[i]-=1;
        }
    }
}
