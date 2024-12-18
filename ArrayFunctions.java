import java.util.Arrays;

public class ArrayFunctions {

    // Original Array
    static void OrgArray(int[] num) {
        System.out.println("Original Array is: " + Arrays.toString(num) + "\n");
    }

    // Function to Show Sum of Array
    static void SumOfArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of Array is: " + sum + "\n");
    }

    // Function to Show Even numbers of Array
    static void EvenNumbers(int[] num) {
        System.out.println("Even Numbers of Array is:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + "  ");
            }
        }
        System.out.println("\n");
    }

    // Function to Show Odd Numbers of Array
    static void OddNumbers(int[] num) {
        int count = 0;
        System.out.println("Odd Numbers of Array is:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + "  ");
                count++;
            }
        }
        System.out.println("\n");
        System.out.println("Count is : " + count);
    }

    // Function to find the LargestNumber
    static void LargestNumber(int[] num) {
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Largest Number of Array is: " + max + "\n");
    }

    // Function to show SmallestNumber
    static void SmallestNumber(int[] num) {
        int min = num[1];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Smallest Number of Array is: " + min + "\n");
    }

    // Search Element
    static void SearchElement(int[] num, int data) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == data)
                System.out.println("This element is at index number = " + i);
        }
    }
}
