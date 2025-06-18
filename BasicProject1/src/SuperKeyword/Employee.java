package SuperKeyword;

public class Employee {  // Parent class
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Child class
class Manager extends Employee {  // Child class
    String department;

    // Constructor using super to call parent constructor
    Manager(String name, double salary, String department) {
        super(name, salary); // call Employee constructor
        this.department = department;
    }

    // Overriding method and using super to call parent method
    @Override
    void displayInfo() {
        super.displayInfo(); // call parent displayInfo()
        System.out.println("Department: " + department);
    }

// Main class
    public static void main(String[] args) {
        Manager mgr = new Manager("John Doe", 85000, "IT");
        mgr.displayInfo();
    }
}