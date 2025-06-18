package Inheritance1;

class Employee {
    String name;
    int id;
    double basicSalary;
}

class FullTimeEmployee extends Employee {
    double benefits;

    void calculateSalary() {
        double total = basicSalary + benefits;
        System.out.println("Employee: " + name + " (ID: " + id + ")");
        System.out.println("Type: Full-time");
        System.out.println("Total Salary: ₹" + total);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    void calculateSalary() {
        double total = hourlyRate * hoursWorked;
        System.out.println("Employee: " + name + " (ID: " + id + ")");
        System.out.println("Type: Part-time");
        System.out.println("Total Salary: ₹" + total);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        PartTimeEmployee pt = new PartTimeEmployee();
        pt.name = "Rahul";
        pt.id = 101;
        pt.hourlyRate = 300;
        pt.hoursWorked = 20;
        pt.calculateSalary();
    }
}
