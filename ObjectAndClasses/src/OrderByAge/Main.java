package OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<Person> personList = new ArrayList<>();
        while(!command.equals("End")){
            String[] commandArr=command.split(" ");
            String name = commandArr[0];
            String id = commandArr[1];
            int age = Integer.parseInt(commandArr[2]);

            Person person = new Person(name,id,age);
            personList.add(person);

            command = scan. nextLine();

        }
        Collections.sort(personList, Comparator.comparingInt(Person::getAge));
        for (Person person:personList) {
            System.out.println(person.getName()+ " with ID: " +person.getId() + " is " +person.getAge() + " years old.");
        }
    }
}
