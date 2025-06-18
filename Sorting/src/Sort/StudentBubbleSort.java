package Sort;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentBubbleSort {
    public static void main(String[] args) {
        // Array of 10 students
        Student[] students = {
            new Student("Aman", 76),
            new Student("Bina", 85),
            new Student("Chirag", 69),
            new Student("Divya", 92),
            new Student("Esha", 58),
            new Student("Farhan", 74),
            new Student("Gita", 88),
            new Student("Harsh", 62),
            new Student("Isha", 79),
            new Student("Jay", 70)
        };

        // Sort using bubble sort by marks
        bubbleSort(students);

        // Print sorted students
        System.out.println("Students sorted by marks:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }

    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].marks > arr[j + 1].marks) {
                    // swap students
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
       }
    }
}