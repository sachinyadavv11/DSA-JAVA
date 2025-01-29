public class CountElements {
    public static void countElements(int[] arr, int target) {
        int lessOrEqual = 0;
        int greaterOrEqual = 0;

        // Since the array is sorted, we can use binary search or a simple linear search
        // Here we'll use a linear search for simplicity, but for larger arrays, binary search would be more efficient
        for (int num : arr) {
            if (num <= target) {
                lessOrEqual++;
            }
            if (num >= target) {
                greaterOrEqual++;
            }
        }

        System.out.println("Less or equal numbers are : " + lessOrEqual +
                " || Greater or equal numbers : " + greaterOrEqual);
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 8, 10, 11, 12, 19};
        int target1 = 0;
        countElements(arr1, target1);
//        int[] result1 = countElements(arr1, target1);
//        System.out.println("Target: " + target1 + ", Output: " + result1[0] + ", " + result1[1]);

        // Example 2
        int[] arr2 = {1, 5, 8, 12, 12, 12, 19};
        int target2 = 12;
//        int[] result2 = countElements(arr2, target2);
//        System.out.println("Target: " + target2 + ", Output: " + result2[0] + ", " + result2[1]);
    }
}