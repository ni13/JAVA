package NewJava;

public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 6; // Change this to print more or fewer rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
