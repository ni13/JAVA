package NewJava;

public class LearnClassandObject {

    // 1: Teacher and SubjectTeacher
    static class Teacher {
        String name = "Mrs. Kapoor";

        void teach() {
            System.out.println("Teaching general subjects.");
        }
    }

    static class SubjectTeacher extends Teacher {
        String name = "Mr. Sharma";

        void teach() {
            super.teach();
            System.out.println("Teaching Mathematics.");
        }

        void showNames() {
            System.out.println("Parent name: " + super.name);
            System.out.println("Child name: " + name);
        }
    }

    // 2: Vehicle and Car
    static class Vehicle {
        int speed = 60;
    }

    static class Car extends Vehicle {
        int speed = 100;

        void displaySpeed() {
            System.out.println("Speed of Car: " + speed + " km/h");
            System.out.println("Speed of Vehicle: " + super.speed + " km/h");
        }
    }

    // 3: Animal and Dog
    static class Animal {
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    static class Dog extends Animal {
        void makeSound() {
            super.makeSound();
            System.out.println("Bark!");
        }
    }

    //  4: Bank and Branch
    static class Bank {
        Bank(String bankName) {
            System.out.println("Bank Name: " + bankName);
        }
    }

    static class Branch extends Bank {
        Branch(String bankName, String branchName) {
            super(bankName);
            System.out.println("Branch Name: " + branchName);
        }
    }

    // 5: LibraryItem and Book
    static class LibraryItem {
        String title;

        LibraryItem(String title) {
            this.title = title;
        }

        void displayInfo() {
            System.out.println("Title: " + title);
        }
    }

    static class Book extends LibraryItem {
        String author;

        Book(String title, String author) {
            super(title);
            this.author = author;
        }

        void displayInfo() {
            super.displayInfo();
            System.out.println("Author: " + author);
        }
    }

    //  6: Doctor and Surgeon
    static class Doctor {
        void duty() {
            System.out.println("General medical duties");
        }
    }

    static class Surgeon extends Doctor {
        void duty() {
            super.duty();
            System.out.println("Performing surgeries");
        }
    }

    // 7: Person and Student
    static class Person {
        Person(String name) {
            System.out.println("Person Name: " + name);
        }
    }

    static class Student extends Person {
        Student(String name, String course) {
            super(name);
            System.out.println("Course Enrolled: " + course);
        }
    }

    // Main method to run everything
    public static void main(String[] args) {
        System.out.println("--- Question 1 ---");
        SubjectTeacher st = new SubjectTeacher();
        st.teach();
        st.showNames();

        System.out.println("\n--- Question 2 ---");
        Car car = new Car();
        car.displaySpeed();

        System.out.println("\n--- Question 3 ---");
        Dog dog = new Dog();
        dog.makeSound();

        System.out.println("\n--- Question 4 ---");
        new Branch("ABC Bank", "Mumbai Branch"); // removed unused variable warning

        System.out.println("\n--- Question 5 ---");
        Book book = new Book("Java Basics", "James Gosling");
        book.displayInfo();

        System.out.println("\n--- Question 6 ---");
        Surgeon surgeon = new Surgeon();
        surgeon.duty();

        System.out.println("\n--- Question 7 ---");
        new Student("Rahul", "Computer Science"); // removed unused variable warning
    }
}
