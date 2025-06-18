package queue;

import java.util.ArrayDeque;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove indices out of window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Remove smaller values from end
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                System.out.println("Window max: " + arr[deque.peekFirst()]);
            }
        }
    }
}
