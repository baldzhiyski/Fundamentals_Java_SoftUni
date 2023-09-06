import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student{
        String firstName;
        String lastName;
        String age ;
        String homeTown;

        public Student(String firstName, String lastName , String age, String homeTown){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.homeTown=homeTown;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Student> studentsList = new ArrayList<>();
        while(!input.equals("end")){
            String[] studentsArr = input.split(" ");

            String firstName =studentsArr[0];
            String lastName = studentsArr[1];
            String age =studentsArr[2];
            String town =studentsArr[3];

            Student student = new Student(firstName,lastName,age,town);
            studentsList.add(student);

            input=scan.nextLine();
        }
        String homeTown = scan.nextLine();
        for (Student student :studentsList) {
            if(student.getHomeTown().equals(homeTown)){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
