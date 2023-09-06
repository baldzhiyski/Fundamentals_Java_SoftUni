import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, List<String>> mapOfEmlpoyees = new LinkedHashMap<>();
        while(!input.equals("End")){
            String[] commandArr = input.split(" -> ");
            String nameOfCompany = commandArr[0];
            String iD = commandArr[1];
            if(!mapOfEmlpoyees.containsKey(nameOfCompany)){
                mapOfEmlpoyees.put(nameOfCompany,new ArrayList<>());
                mapOfEmlpoyees.get(nameOfCompany).add(iD);
            }else {
                List<String> ids = mapOfEmlpoyees.get(nameOfCompany);
                if (checkMethod(iD, ids)){
                    mapOfEmlpoyees.get(nameOfCompany).add(iD);
                }
            }
            input=scan.nextLine();
        }
        mapOfEmlpoyees.entrySet().forEach(entry-> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(id-> System.out.println("-- "+ id));
        });
    }
    private static boolean checkMethod(String iD, List<String> ids) {
        for (String id: ids) {
            if(id.equals(iD)){
                return false;
            }
        }
        return  true;
    }
}
