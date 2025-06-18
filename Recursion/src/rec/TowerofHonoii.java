package rec;

public class TowerofHonoii {

    // Recursive method to solve the Tower of Hanoi puzzle
    public static void solveHanoi(int n, char source, char helper, char destination) {
        // Base case: if there's only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move (n-1) disks from source to helper, using destination as temporary
        solveHanoi(n - 1, source, destination, helper);

        // Step 2: Move the largest disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the (n-1) disks from helper to destination, using source as temporary
        solveHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change this to try more disks
        System.out.println("Solution for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}
