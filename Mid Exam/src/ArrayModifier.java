import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();
        while(!input.equals("end")){
            String command = input.split(" ")[0];
            switch (command){
                case "swap":
                    int index1 =Integer.parseInt(input.split(" ")[1]);  // parse ("2") -> 2
                    int index2 = Integer.parseInt(input.split(" ")[2]);
                    int firstnum = numArr[index1];
                    int secondNum = numArr[index2];
                    numArr[index1]=secondNum;
                    numArr[index2] = firstnum;
                    break;
                case "multiply":
                    int indexFirst =Integer.parseInt(input.split(" ")[1]);  // parse ("2") -> 2
                    int indexSecond = Integer.parseInt(input.split(" ")[2]);
                    int firstNum= numArr[indexFirst];
                    int secondnum = numArr[indexSecond];
                    int result = firstNum*secondnum;
                    numArr[indexFirst]=result;
                    break;
                case"decrease":
                    print(numArr);
                    break;
            }
            input=scan.nextLine();
        }
        System.out.println(Arrays.toString(numArr).replace("[", "")
                .replace("]", ""));
    }
    public static void print (int[] nums){
        for (int i = 0; i <= nums.length -1 ; i++) {
                nums[i]--;
                //number[i]-=1;
        }
    }
}
