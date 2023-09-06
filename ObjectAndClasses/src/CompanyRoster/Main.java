package CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String[] inputArr = scan.nextLine().split(" ");
            String name = inputArr[0];
            double salary =Double.parseDouble(inputArr[1]);
            String position = inputArr[2];
            String department = inputArr[3];
            String email = "n/a";
            String age = "-1";

            if (inputArr.length >= 5) {
                if (inputArr[4].contains("@")) {
                    email = inputArr[4];
                } else {
                    age = inputArr[4];
                }
            }
            if (inputArr.length == 6) {
                age = inputArr[5];
            }
            Department department1 = new Department(department,salary);
            departmentList.add(department1);
            Employee employee = new Employee(name,salary,position,department,email,age);
            employeeList.add(employee);
        }
        List<Department> newListForEachDepartment = new ArrayList<>();
        for (int i = 0; i < departmentList.size(); i++) {
        String departmentName;
        double sum = 0;
        int times = 1;
        departmentName = departmentList.get(i).getDepartment();
            for (int j = i+1; j < departmentList.size() ; j++) {
                if(departmentList.get(j).getDepartment().equals(departmentName)){
                    sum+=departmentList.get(i).getSalary() + departmentList.get(j).getSalary();
                    times++;
                }
            }
            double average = sum/times;
            if(times==1){
                average=departmentList.get(i).getSalary();
            }
            Department department = new Department(departmentName,average);
            newListForEachDepartment.add(department);
        }
        Collections.sort(newListForEachDepartment,Comparator.comparingDouble(Department::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s%n",newListForEachDepartment.get(0).getDepartment());
        Collections.sort(employeeList,Comparator.comparingDouble(Employee::getSalary).reversed());
        for (Employee employee:employeeList) {
            if(employee.getDepartment().equals(newListForEachDepartment.get(0).getDepartment())){
                System.out.printf("%s %.2f %s %s%n",employee.getName(),employee.getSalary(),employee.getEmail()
                        ,employee.getAge());
            }
        }

    }
}
