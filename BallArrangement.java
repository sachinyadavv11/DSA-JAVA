import java.util.ArrayList;
import java.util.List;

public class BallArrangement {
    public static void main(String[] args) {
        // Input
        int green = 1, yellow = 2, red = 1;

        // List to store all valid arrangements
        List<String> arrangements = new ArrayList<>();

        // Call the recursive function to generate arrangements
        generateArrangements("", green, yellow, red, arrangements);

        // Output the arrangements
        System.out.println("Number of arrangements: " + arrangements.size());
        System.out.println("Arrangements: " + arrangements);
    }

    // Recursive function to generate arrangements
    public static void generateArrangements(String current, int green, int yellow, int red, List<String> arrangements) {
        // Base case: when no balls are left to place, add the current arrangement
        if (green == 0 && yellow == 0 && red == 0) {
            arrangements.add(current);
            return;
        }

        // Recursive case: Place a green ball if available and it doesn't conflict
        if (green > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != 'G')) {
            generateArrangements(current + "G", green - 1, yellow, red, arrangements);
        }

        // Place a yellow ball if available and it doesn't conflict
        if (yellow > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != 'Y')) {
            generateArrangements(current + "Y", green, yellow - 1, red, arrangements);
        }

        // Place a red ball if available and it doesn't conflict
        if (red > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != 'R')) {
            generateArrangements(current + "R", green, yellow, red - 1, arrangements);
        }
    }
}