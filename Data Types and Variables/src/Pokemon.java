import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int pokePower = Integer.parseInt(scan.nextLine());
        int Power = pokePower;
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());
        int countTargets = 0;
        while (distance<=pokePower){
            pokePower-=distance;
            countTargets++;
            if (pokePower==0.5*Power){
                if(exhaustionFactor!=0){
                    pokePower/=exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(countTargets);

    }
}
