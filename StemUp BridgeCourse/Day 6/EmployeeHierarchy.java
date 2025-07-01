class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 1001, 80000, "Sales");
        Developer d = new Developer("Bob", 1002, 75000, "Java");

        System.out.println("Manager Details:");
        m.getDetails();

        System.out.println("\nDeveloper Details:");
        d.getDetails();
    }
}
