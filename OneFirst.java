public class OneFirst {

    public static int firstOne(int[] arr) {
        int result = -1; // Default to -1 if no 1 is found
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Update mid inside the loop

            if (arr[mid] == 1) {
                result = mid; // Store potential result
                end = mid - 1; // Move left
            } else {
                start = mid + 1; // Move right
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int result = firstOne(new int[]{0, 0, 0, 0, 0, 0});
        System.out.println("Index is : " + result);
    }
}