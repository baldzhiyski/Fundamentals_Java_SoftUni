import java.util.*;
import java.util.stream.Collectors;

public class Numbers  {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        List<Integer> listOfNum = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        print(listOfNum);

    }
    public  static void  print(List<Integer> list){
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;
        for (int el:list) {
            sum+=el;
        }
        double averageNum = sum*1.0/list.size();
        for (int el:list) {
            if(el>averageNum){
                resultList.add(el);
            }
        }
        resultList.sort(Collections.reverseOrder());
        if(resultList.size()<=5 && resultList.size()>1) {
            for (int i = 0; i <resultList.size(); i++) {
                System.out.print(resultList.get(i) + " ");
            }
        }else if(resultList.isEmpty()){
            System.out.println("No");
        }else {
            resultList=resultList.stream().limit(5).collect(Collectors.toList());
            resultList.stream().forEach(item->System.out.print(item+" "));
        }
    }
}
