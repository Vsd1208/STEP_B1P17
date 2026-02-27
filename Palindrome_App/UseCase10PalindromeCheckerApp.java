import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome using two-pointer approach
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Step 1: Normalize string
        // Remove spaces using Regular Expression
        String normalized = input.replaceAll("\\s+", "");

        // Convert to lowercase for case-insensitive comparison
        normalized = normalized.toLowerCase();

        // Step 2: Apply palindrome logic
        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("Result: The given string is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}