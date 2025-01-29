public class RemDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0; // Edge case: empty array

        int index = 0; // Pointer for placing unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) { // Found a new unique element
                index++;
                arr[index] = arr[i]; // Move unique element forward
            }
        }

        return index + 1; // Size of unique elements array
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };
        int newSize = removeDuplicates(arr);

        System.out.print("Modified Array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSize of Modified Array: " + newSize);
    }
}