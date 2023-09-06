package CompanyRoster;

public class Department {
    String department;
    double salary;

    public Department(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
