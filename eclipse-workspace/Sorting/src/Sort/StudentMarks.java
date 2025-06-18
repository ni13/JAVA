package Sort;

public class StudentMarks {
    public static void insertionSort(int[] marks) {
        for (int i = 1; i < marks.length; i++) {
            int key = marks[i];
            int j = i - 1;

            while (j >= 0 && marks[j] > key) {
                marks[j + 1] = marks[j];
                j--;
            }
            marks[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] marks = {88, 75, 90, 60, 82};

        System.out.println("Before sorting:");
        for (int mark : marks) System.out.print(mark + " ");

        insertionSort(marks);

        System.out.println("\nAfter sorting:");
        for (int mark : marks) System.out.print(mark + " ");
    }
}
