package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> peopleList = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String data = scan.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            if(age>30){
                Person person = new Person(name,age);
                peopleList.add(person);
            }
        }
        for (Person person:peopleList) {
            System.out.println( person.getName() + " - " + person.getAge());
        }
    }
}
