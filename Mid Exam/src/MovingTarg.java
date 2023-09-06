import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarg{
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("End")){
            String command = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            switch (command){
                case"Shoot":
                    int power = Integer.parseInt(input.split(" ")[2]);
                    if(isValid(index,numbers)){
                        int currentNum = numbers.get(index);
                        currentNum-=power;
                        if(currentNum<=0){
                            numbers.remove(index);
                        }else{
                            numbers.set(index,currentNum);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(input.split(" ")[2]);
                    if(isValid(index,numbers)){
                        numbers.add(index,value);
                    }else{
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(input.split(" ")[2]);
                    if(isValid(index,numbers) && isValid(index+radius,numbers) && isValid(index-radius,numbers)){
                        for (int i = index+radius; i >=index-radius ; i--) {
                            numbers.remove(i);
                        }
                    }else{
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            input=scan.nextLine();
        }
        System.out.println(numbers.toString().replace("[","")
                .replaceAll(",","|").replaceAll(" ","").replace("]",""));
    }
    private static boolean isValid(int index,List<Integer> nums){
        return index>=0 && index<=nums.size()-1;
    }
}
