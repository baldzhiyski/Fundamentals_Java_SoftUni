import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeatDelivery {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> neededHeartsNeighbourhoods = Arrays.stream(scan.nextLine().split("@")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        int index = 0;
        while(!input.equals("Love!")) {
            int length = Integer.parseInt(input.split(" ")[1]);
            index+=length;
            if(index>neededHeartsNeighbourhoods.size()-1){
                index=0;
            }
            if(neededHeartsNeighbourhoods.get(index)!=0){
                int currentNum = neededHeartsNeighbourhoods.get(index);
                currentNum-=2;
                neededHeartsNeighbourhoods.set(index,currentNum);
                if(neededHeartsNeighbourhoods.get(index)==0){
                    System.out.printf("Place %d has Valentine's day.%n",index);
                }
                if(currentNum<=0){
                    currentNum=0;
                    neededHeartsNeighbourhoods.set(index,currentNum);
                }
            }else{
                System.out.printf("Place %d already had Valentine's day.%n",index);
            }
            input=scan.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",index);
        hasFailed(neededHeartsNeighbourhoods);

    }

    private static void hasFailed(List<Integer> neededHeartsNeighbourhoods) {
        boolean isFailed = false;
        int countFailedHouses = 0;
        for (Integer neededHeartsNeighbourhood : neededHeartsNeighbourhoods) {
            if (neededHeartsNeighbourhood > 0) {
                isFailed = true;
                countFailedHouses++;
            }
        }
        if (isFailed) {
            System.out.printf("Cupid has failed %d places.", countFailedHouses);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}