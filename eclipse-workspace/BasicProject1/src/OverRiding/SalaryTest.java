package OverRiding;

//Superclass
class Employee {
 public void calculateSalary() {
     System.out.println("Calculating base salary...");
 }
}

//Subclass 1
class FullTimeEmployee extends Employee {
 @Override
 public void calculateSalary() {
     System.out.println("Calculating full-time salary with benefits...");
 }
}

//Subclass 2
class PartTimeEmployee extends Employee {
 @Override
 public void calculateSalary() {
     System.out.println("Calculating part-time salary based on hours...");
 }
}

public class SalaryTest {
 public static void main(String[] args) {
     Employee e1 = new FullTimeEmployee();
     Employee e2 = new PartTimeEmployee();

     e1.calculateSalary(); // FullTimeEmployee version
     e2.calculateSalary(); // PartTimeEmployee version
 }
}
