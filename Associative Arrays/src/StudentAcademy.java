import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String , List<Double>> studentsGrades = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String student = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if(studentsGrades.containsKey(student)){
                studentsGrades.get(student).add(grade);
            }else{
                studentsGrades.put(student,new ArrayList<>());
                studentsGrades.get(student).add(grade);
            }
        }
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        studentsGrades.entrySet().forEach(stringListEntry -> {
            List<Double> grades = stringListEntry.getValue();
            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            studentAverageGrade.put(stringListEntry.getKey(),average);
        });
        studentAverageGrade.entrySet()
                .stream()
                .filter(stringDoubleEntry -> stringDoubleEntry.getValue()>=4.5)
                .forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
}
