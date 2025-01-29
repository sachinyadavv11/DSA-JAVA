public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {4, 1, 3, 9, 7};
        selectionSort(arr1);
        System.out.println("Sorted array 1:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(arr2);
        System.out.println("Sorted array 2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 3
        int[] arr3 = {38, 31, 20, 14, 30};
        selectionSort(arr3);
        System.out.println("Sorted array 3:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}