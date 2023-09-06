import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOwAr {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> statusPirateShip = Arrays.stream(scan.nextLine().split(">")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> statusWarShip = Arrays.stream(scan.nextLine().split(">")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while(!input.equals("Retire")){
            String command = input.split(" ")[0];
            switch (command){
                case "Fire":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    int damage = Integer.parseInt(input.split(" ")[2]);
                    if(checkRange(statusWarShip,index)){
                        int currentNum = statusWarShip.get(index);
                        currentNum-=damage;
                        if(currentNum<=0){
                            System.out.println("You won! The enemy ship has sunken.");
                           return;
                        }else{
                            statusWarShip.set(index,currentNum);
                        }
                    }
                    break;
                case "Defend":
                    int indexx= Integer.parseInt(input.split(" ")[1]);
                    int secondIndex = Integer.parseInt(input.split(" ")[2]);
                    int damageDone = Integer.parseInt(input.split(" ")[3]);
                    if(checkRange(statusPirateShip,indexx) && checkRange(statusPirateShip,secondIndex) &&  indexx<secondIndex){
                        for (int i = indexx; i <=secondIndex ; i++) {
                            int num = statusPirateShip.get(i);
                            num-=damageDone;
                            if(num<=0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }else{
                                statusPirateShip.set(i,num);
                            }
                        }
                    }
                    break;
                case "Repair":
                    int indexX = Integer.parseInt(input.split(" ")[1]);
                    int health = Integer.parseInt(input.split(" ")[2]);
                    if(checkRange(statusPirateShip,indexX)){
                        int number = statusPirateShip.get(indexX);
                        number+=health;
                        if(number>maxHealth){
                            number=maxHealth;
                            statusPirateShip.set(indexX,number);
                        }else{
                        statusPirateShip.set(indexX,number);
                        }
                    }
                    break;
                case "Status":
                    int sections= status(statusPirateShip,maxHealth);
                    System.out.printf("%d sections need repair.%n",sections);
                    break;
            }
            input=scan.nextLine();
        }

            System.out.printf("Pirate ship status: %d%n",sum(statusPirateShip));
            System.out.printf("Warship status: %d%n",sum(statusWarShip));
    }
    public static boolean checkRange(List<Integer> list, int index){
        return index>=0 && index<=list.size()-1;
    }
    public static Integer status (List<Integer> nums , int maxHealth){
        int times = 0;

        double minimum = maxHealth*1.0/5;
        for (int el:nums) {
            if(el<minimum){
                times++;
            }
        }
        return times;
    }
    public static Integer sum (List<Integer> nums) {
        return nums.stream().mapToInt(Integer::intValue).sum();
    }
}
