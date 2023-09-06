
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Double> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i <numbersList.size()-1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i+1);
            if(currentNum==nextNum){
                double sum = currentNum+nextNum;
                numbersList.set(i,sum);
                numbersList.remove(i+1);
                i--;
            }
        }
        System.out.println(joinElementsByDelimiter(" ",numbersList));
    }
    public static String joinElementsByDelimiter(String delimiter ,List<Double> list){
        DecimalFormat fd = new DecimalFormat("0.#");
        String result = "";
        for (double item:list) {
            String numDf = fd.format(item) + delimiter;
            result+=numDf;
        }
        return result;
    }
}
