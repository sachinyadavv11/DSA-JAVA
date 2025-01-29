import java.util.Arrays;
import java.util.HashSet;

public class SumOfDistinctElements {
    public static int sumDistinct(int[] arr) {
        // Using HashSet to keep only distinct elements
        HashSet<Integer> distinctSet = new HashSet<>();

        // Add each element to the set
        for (int num : arr) {
            distinctSet.add(num);
        }

        // Calculate the sum of distinct elements
        int sum = 0;
        for (int num : distinctSet) {
            sum += num;
        }

        Integer[] array = distinctSet.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));

        return sum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(sumDistinct(arr1));  // Output: 15

        // Example 2
        int[] arr2 = {5, 5, 5, 5, 5};
        System.out.println(sumDistinct(arr2));  // Output: 5
    }
}