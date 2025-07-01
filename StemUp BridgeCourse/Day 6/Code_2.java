class Employee {
    String name;
    int eId;
    double sal;

    void work() {
        System.out.println(name + " is working.");
    }

    void takeBreak() {
        System.out.println(name + " is taking a break.");
    }
}

class Manager extends Employee {
    String department;
    int teamSize;

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting for " + department + " department.");
    }
}

class Developer extends Employee {
    String programmingLanguage;
    int projects;

    void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

public class Code_2 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.name = "ABC";
        mgr.department = "Development";
        mgr.work();
        mgr.conductMeeting();

        Developer dev = new Developer();
        dev.name = "DEF";
        dev.programmingLanguage = "Java";
        dev.takeBreak();
        dev.writeCode();
    }
}

