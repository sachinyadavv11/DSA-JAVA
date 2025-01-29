public class Solution {

    public static int firstIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1, 1};
        int result = firstIndex(arr1);
        System.out.println(result);
    }

}