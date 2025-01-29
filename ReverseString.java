import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        // Base case: If the string is empty or has one character, return the string
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: Reverse the rest of the string and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}