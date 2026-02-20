public class PalindromeCheckerApp {
    public static void main(String[] args) {
        showWelcomeMessage();
        checkHardcodedPalindrome();
        checkPalindromeUsingReverse();
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
}

