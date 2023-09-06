import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> distances = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        while(distances.size()>0){
            int index = Integer.parseInt(scan.nextLine());
            if(index>=0 && index<=distances.size()-1){
                int removedEl = distances.get(index);
                sum+=removedEl;
                distances.remove(index);
                changedElements(distances, removedEl);
            }else if(index<0){
                int removedFirstEl = distances.get(0);
                sum+=removedFirstEl;
                int lastElement = distances.get(distances.size()-1);
                distances.set(0,lastElement);
                changedElements(distances,removedFirstEl);
            }else if ( index> distances.size()-1){
                int removedEl = distances.get(distances.size()-1);
                sum+=removedEl;
                int firstEl = distances.get(0);
                distances.set(distances.size()-1,firstEl);
                changedElements(distances,removedEl);
            }
        }
        System.out.println(sum);
    }
    private static void changedElements(List<Integer> distances, int removedEl) {
        for (int i = 0; i <= distances.size()-1 ; i++) {
            int currentNum = distances.get(i);
            if(currentNum<= removedEl){
                currentNum+= removedEl;
            }else{
                currentNum-= removedEl;
            }
            distances.set(i,currentNum);
        }
    }
}
