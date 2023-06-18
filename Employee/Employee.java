package Employee;
import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String name;
    private Date hireDate;

    // Constructor
    public Employee(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public static void main(String[] args) {
        // Create an ArrayList to store employees
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Add employees to the list
        employeeList.add(new Employee("John Doe", new Date(2020, 1, 1)));
        employeeList.add(new Employee("Jane Smith", new Date(2019, 5, 15)));
        employeeList.add(new Employee("Mike Johnson", new Date(2021, 10, 30)));

        // Print the names of employees hired before 2021 using a for loop
        System.out.println("Employees hired before 2021:");
        for (Employee employee : employeeList) {
            if (employee.getHireDate().getYear() < 121) {  // Year is represented as years since 1900
                System.out.println(employee.getName());
            }
        }

        // Print the names of employees using a for-each loop
        System.out.println("\nAll employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }

        // Print the names of employees using a while loop
        System.out.println("\nAll employees (while loop):");
        int i = 0;
        while (i < employeeList.size()) {
            System.out.println(employeeList.get(i).getName());
            i++;
        }

        // Print the names of employees using a do-while loop
        System.out.println("\nAll employees (do-while loop):");
        int j = 0;
        do {
            System.out.println(employeeList.get(j).getName());
            j++;
        } while (j < employeeList.size());
    }
}

