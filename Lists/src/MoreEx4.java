import java.util.*;
import java.util.stream.Collectors;

public class MoreEx4 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> firstList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> wholeList = new ArrayList<>();
        int minSize = Math.min(firstList.size(),secondList.size());
        List<Integer> resultListt = new ArrayList<>();
        if (firstList.size()>secondList.size()){
            for (int i = 0; i <minSize ; i++) {
              int numFirstList = firstList.get(i);
              int numSecondList = secondList.get(minSize-1-i);
              wholeList.add(numFirstList);
              wholeList.add(numSecondList);
        }
             List<Integer> subList = firstList.subList(minSize,firstList.size());
            resultListt=result(wholeList,subList);

        }else if(secondList.size()>firstList.size()){
            for (int i = 0; i <minSize ; i++) {
                int numFirstList = firstList.get(i);
                int numSecondList = secondList.get((minSize-1)+2-i);
                wholeList.add(numFirstList);
                wholeList.add(numSecondList);
            }
            List<Integer> sublist = secondList.subList(0,2);
            resultListt= result(wholeList,sublist);
        }
        Collections.sort(resultListt);
        System.out.println(resultListt.toString().replace("]","")
                .replace("[","").replaceAll(",","").trim());

    }
    public static List<Integer> result(List<Integer> firstList , List<Integer> secondList){
        List<Integer> resultList = new ArrayList<>();
        Collections.sort(secondList);
        for (int num: firstList) {
            if(num>secondList.get(0) && num< secondList.get(1)){
                resultList.add(num);
            }
        }
        return resultList;
    }
}
