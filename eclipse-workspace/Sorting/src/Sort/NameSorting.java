package Sort;

public class NameSorting {
    public static void insertionSort(String[] names) {
        for (int i = 1; i < names.length; i++) {
            String key = names[i];
            int j = i - 1;

            while (j >= 0 && names[j].compareTo(key) > 0) {
                names[j + 1] = names[j];
                j--;
            }
            names[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] names = {"Zara", "Ali", "John", "Ben", "Emma"};

        System.out.println("Before sorting:");
        for (String name : names) {
            System.out.print(name + " ");
        }

        insertionSort(names);

        System.out.println("\nAfter sorting:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
