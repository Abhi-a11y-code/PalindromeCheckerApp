import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        showWelcomeMessage();
        checkHardcodedPalindrome();
        checkPalindromeUsingReverse();
        checkPalindromeUsingCharArray();
        checkPalindromeUsingStack();
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
}

