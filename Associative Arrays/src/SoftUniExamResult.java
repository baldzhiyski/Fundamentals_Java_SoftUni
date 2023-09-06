
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String , Integer > pointAndUsername = new LinkedHashMap<>();
        Map<String , Integer> countSubmissionsMap = new LinkedHashMap<>();
        while(!command.equals("exam finished")){
            String[] splittedArray = command.split("-");
            String username = splittedArray[0];
            if(splittedArray.length==3){
                String language = splittedArray[1];
                int points = Integer.parseInt(splittedArray[2]);
                if (!pointAndUsername.containsKey(username)) {
                    pointAndUsername.put(username,points);
                }else{
                    int currentPoints = pointAndUsername.get(username);
                    if(points>currentPoints){
                    pointAndUsername.put(username,points);
                    }
                }
                if(!countSubmissionsMap.containsKey(language)){
                    countSubmissionsMap.put(language,1);
                }else{
                    countSubmissionsMap.put(language,countSubmissionsMap.get(language) + 1);
                }

            }else{
                pointAndUsername.remove(username);
            }
            command=scan.nextLine();
        }
        System.out.println("Results:");
        pointAndUsername.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));

        System.out.println("Submissions:");
        countSubmissionsMap.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

//        System.out.println("Results:");
//        userPoints.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
//
//        System.out.println("Submissions:");
//        languageCount.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
//                if we wanna sort them !

    }
}
