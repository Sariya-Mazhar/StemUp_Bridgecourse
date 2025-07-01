abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculatePayroll();
}

class SalariedEmployee extends Employee {
    double monthlySalary;

    SalariedEmployee(String name, double monthlySalary) {
        super(name); // Call parent constructor
        this.monthlySalary = monthlySalary;
    }

    double calculatePayroll() {
        return monthlySalary;
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name); 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculatePayroll() {
        return hourlyRate * hoursWorked;
    }
}

public class Code_9 {
    public static void main(String[] args) {

        Employee[] employees = {
            new SalariedEmployee("Alice", 50000),
            new HourlyEmployee("Bob", 200, 40),
            new HourlyEmployee("Charlie", 150, 35)
        };

        System.out.println("Payroll Report:");
        for (Employee emp : employees) {
            System.out.println(emp.name + ": ₹" + emp.calculatePayroll());
        }
    }
}
