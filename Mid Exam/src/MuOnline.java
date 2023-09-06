import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int health = 100;
        String[] roomsArr = scan.nextLine().split("\\|");
        int bitcoins = 0;
        for (int i = 0; i <roomsArr.length ; i++) {
            String room = roomsArr[i];
            String command = room.split(" ")[0];
            switch (command){
                case "potion":
                    int number = Integer.parseInt(room.split(" ")[1]);
                    if(health<100 ) {
                        if(health+number<=100){
                        health += number;
                        }else{
                            number=100-health;
                            health=100;
                        }
                    }
                    System.out.printf("You healed for %d hp.%n",number);
                    System.out.printf("Current health: %d hp.%n",health);
                    break;
                case"chest":
                    int numberBitcoins = Integer.parseInt(room.split(" ")[1]);
                    bitcoins+=numberBitcoins;
                    System.out.printf("You found %d bitcoins.%n",numberBitcoins);
                    break;
                default:
                    int attackPower = Integer.parseInt(room.split(" ")[1]);
                    health-=attackPower;
                    if(health>0){
                        String monster = command;
                        System.out.printf("You slayed %s.%n",monster);
                    }else{
                        System.out.printf("You died! Killed by %s.%nBest room: %d%n",command,i+1);
                        return;
                    }
                    break;
            }
        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d",bitcoins,health);
    }
}
