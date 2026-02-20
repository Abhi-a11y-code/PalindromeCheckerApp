import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        showWelcomeMessage();
        checkHardcodedPalindrome();
        checkPalindromeUsingReverse();
        checkPalindromeUsingCharArray();
        checkPalindromeUsingStack();
        checkPalindromeUsingQueueAndStack();
        checkPalindromeUsingDeque();
    }

    public static void showWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App");
        System.out.println("=================================");
    }
    // UC2: Hardcoded Palindrome
    public static void checkHardcodedPalindrome() {

        String word = "madam";   // hardcoded string
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
    // UC3 – Palindrome using reverse logic
    public static void checkPalindromeUsingReverse() {

        String original = "level";
        String reversed = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if(original.equals(reversed)) {
            System.out.println(original + " is a Palindrome (UC3)");
        } else {
            System.out.println(original + " is NOT a Palindrome (UC3)");
        }
    }
    // UC4 – Character Array Based Palindrome Check
    public static void checkPalindromeUsingCharArray() {

        String word = "radar";

        // Convert string to char array
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (UC4)");
        } else {
            System.out.println(word + " is NOT a Palindrome (UC4)");
        }
    }
    // UC5 – Stack Based Palindrome Checker
    public static void checkPalindromeUsingStack() {

        String word = "civic";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (UC5)");
        } else {
            System.out.println(word + " is NOT a Palindrome (UC5)");
        }
    }
    // UC6 – Queue + Stack Based Palindrome Check
    public static void checkPalindromeUsingQueueAndStack() {

        String word = "refer";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push to stack and enqueue to queue
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!stack.isEmpty()) {

            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (UC6)");
        } else {
            System.out.println(word + " is NOT a Palindrome (UC6)");
        }
    }
    // UC7 – Deque Based Optimized Palindrome Checker
    public static void checkPalindromeUsingDeque() {

        String word = "rotor";

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until empty
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (UC7)");
        } else {
            System.out.println(word + " is NOT a Palindrome (UC7)");
        }
    }
}

