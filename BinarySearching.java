public class BinarySearching {

    public static int findNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            System.out.println(mid);

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 2;
        int result = findNumber(array, target);
        System.out.println("Index is : " + result);
    }


}