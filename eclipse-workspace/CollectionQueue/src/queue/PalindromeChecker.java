package queue;

import java.util.ArrayDeque;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(input + " is palindrome? " + isPalindrome);
    }
}

