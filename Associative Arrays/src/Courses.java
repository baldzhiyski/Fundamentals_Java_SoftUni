import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String , List<String>> products = new LinkedHashMap<>();
        while(!command.equals("end")){
            String[] arr = command.split(" : ");
            String courseName = arr[0];
            String studentName = arr[1];
            if (!products.containsKey(courseName)) {
                products.put(courseName,new ArrayList<>());
                products.get(courseName).add(studentName);
            }else{
                products.get(courseName).add(studentName);
            }
            command=scan.nextLine();
        }
        products.entrySet().forEach(courseName->{
            System.out.printf("%s: %d%n",courseName.getKey(),courseName.getValue().size());
            courseName.getValue().stream().forEach(student->System.out.printf("-- %s%n",student));
        });
    }
}
