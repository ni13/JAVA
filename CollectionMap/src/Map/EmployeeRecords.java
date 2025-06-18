package Map;

import java.util.TreeMap;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        TreeMap<Integer, Employee> employees = new TreeMap<>();
        employees.put(103, new Employee("Alice"));
        employees.put(101, new Employee("Bob"));
        employees.put(102, new Employee("Charlie"));

        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }
    }
}
