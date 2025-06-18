package vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> students = new Vector<>();
        students.add("Vaishali");
        students.add("Rahul");
        students.add("Sneha");

        System.out.println("First student: " + students.get(0)); // Vaishali
    }
}