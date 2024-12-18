public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 7, 5};

        if (arr.length < 2) {
            System.out.println("Array must have at least two distinct elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;  // Smallest possible integer
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update second largest if it's not equal to largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (array may contain duplicates of the same element).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}