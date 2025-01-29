import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        scanner.close();

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}