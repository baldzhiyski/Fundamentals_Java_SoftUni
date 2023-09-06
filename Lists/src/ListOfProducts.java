import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> productList= new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String product = scan.nextLine();
            productList.add(product);
        }
        Collections.sort(productList);
        for (int i = 0; i <productList.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,productList.get(i));
        }
    }

}
