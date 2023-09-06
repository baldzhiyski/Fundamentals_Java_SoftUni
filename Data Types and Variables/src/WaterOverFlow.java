import java.util.Scanner;

public class WaterOverFlow {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int time = Integer.parseInt(scan.nextLine());
        int volume = 0;
        for (int i = 1; i <=time ; i++) {
            int litter = Integer.parseInt(scan.nextLine());
            volume+=litter;
            if(volume>255){
                System.out.println("Insufficient capacity!");
                volume-=litter;
            }

        }
        System.out.println(volume);

    }
}
